package com.sbp;

import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Mycontroller {
	@GetMapping("csrf-token")
	public Object getMethodName(HttpServletRequest http) {
		
		return http.getAttribute("_csrf");
	}
	@GetMapping("/session")
	public String getSession (HttpServletRequest http) {
		return http.getRequestedSessionId();
	}
	
	

}
