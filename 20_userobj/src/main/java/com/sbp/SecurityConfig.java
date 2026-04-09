package com.sbp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.memory.UserAttribute;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
	SecurityFilterChain sfc(HttpSecurity http) throws Exception
	{ 
 return		http.csrf(c->c.disable()).authorizeHttpRequests(req->req.anyRequest().authenticated()).httpBasic(Customizer.withDefaults()).formLogin(Customizer.withDefaults()).build();
		}
	@SuppressWarnings("deprecation")
	@Bean
	UserDetailsService userDetailsService()
	{
		UserDetails u1= User.withDefaultPasswordEncoder().username("sanjana").password("123").build();
		return new InMemoryUserDetailsManager(u1);
	}
}
