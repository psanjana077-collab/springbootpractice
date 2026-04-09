package com.sbp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sbp.entity.Student;

@RestController
public class MyController {
@GetMapping(value="/getStudent",produces = { "application/json"})
ResponseEntity<Student> getStud()
{
	Student s=new Student();
	s.setName("Sanju");
	s.setMarks(100);
	s.setRoll_no(1);
	System.out.println("running basic rest api");
	return new ResponseEntity<Student>(s,HttpStatus.resolve(200));
}
@PostMapping(value="/addstud",consumes={"application/json"})
ResponseEntity<String> addStudent(@RequestBody Student stud)
{
	System.out.println(stud);
	return new ResponseEntity<>("add",HttpStatus.OK);
}
@GetMapping("/test")
String test()
{
	return "running rest app";
}

}
