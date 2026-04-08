package com.sbp;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

@RestController
public class MyController {
 @GetMapping("/user")
 public User getUser() {
  User u=new User();
 u.setId(1);
 u.setMail("123@gmail.com");
 u.setName("sanjana");
 u.add(linkTo(methodOn(MyController.class).getUser()).withSelfRel());
 u.add(linkTo(methodOn(MyController.class).getUser()).withRel("all-users")); // example

	return u;
 }
 
}
