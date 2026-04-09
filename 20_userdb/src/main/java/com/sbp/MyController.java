package com.sbp;

import org.springframework.web.bind.annotation.RestController;

import com.sbp.JwtService;
import com.sbp.MyUserDetails;
import com.sbp.UserRepository;
import com.sbp.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class MyController {
	@Autowired
	UserRepository repo;
	@Autowired
	JwtService jwt;
	BCryptPasswordEncoder encoder=new BCryptPasswordEncoder(12);
	@GetMapping("/get")
	public String getMethodName() {
		return new String("get invoked");
	}
	@PostMapping("/register")
	public  String register(@RequestBody Users user)
	{
	user.setPassword(encoder.encode(user.getPassword()));
	repo.save(user);
	  return jwt.generateToken(new MyUserDetails(user));
	  
	}

}
