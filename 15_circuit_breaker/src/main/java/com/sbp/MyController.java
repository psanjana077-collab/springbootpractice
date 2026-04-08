package com.sbp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
@RestController
public class MyController {
@GetMapping("/get/{n}")
@CircuitBreaker(name="fallback",fallbackMethod = "m1")
String get(@PathVariable int n) 
{
	if(n>5)
	{
	throw new RuntimeException("get method exception");
	}
	return "get invoked";
}
public String m1(int n,Throwable t)
{
	System.out.println("fallback method");
	
	return "fallback method";
}
}
