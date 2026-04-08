package com.sbp;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class MyController {
      @Autowired
      MyService service;
	 @GetMapping("/validate/{age}")
	 public String getMethodName(@PathVariable int  age) throws Exception {
		 System.out.println(age);
	 	return service.Validation(age);
	 }
	 
}
