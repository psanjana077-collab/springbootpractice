package com.sbp;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Configuration
@RestControllerAdvice
public class ExceptionConfig {
   @ExceptionHandler(value=CustomException.class)
   public ResponseEntity<ExceptionInfo> customException(CustomException ex)
   {
	   ExceptionInfo e=new ExceptionInfo();
	   e.setStatus(400);
	   e.setMsg("Age should be greater than 18");
	   System.out.println(e.getMsg());
	   return new ResponseEntity<>(e,HttpStatus.BAD_REQUEST);
   }
}
