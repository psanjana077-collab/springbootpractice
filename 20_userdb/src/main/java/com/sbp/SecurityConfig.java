package com.sbp;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	@Autowired
    UserDetailsService uds;
	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception
	{
		return http
		        .csrf(csrf -> csrf.disable())
		        .authorizeHttpRequests(auth -> auth
		            .requestMatchers("/register").permitAll() // ✅ Allow public access
		            .anyRequest().authenticated() // 🔐 All other endpoints need authentication
		        )
		        .formLogin(Customizer.withDefaults())
		        .httpBasic(Customizer.withDefaults())
		        .build();	
		}
	@Bean
	AuthenticationProvider authenticationProvider()
	{
		DaoAuthenticationProvider d=new DaoAuthenticationProvider();
		d.setUserDetailsService(uds); 
		d.setPasswordEncoder(new BCryptPasswordEncoder(12));
		return d;
	}
}
