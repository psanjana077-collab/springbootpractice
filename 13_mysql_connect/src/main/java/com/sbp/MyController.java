package com.sbp;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class MyController {
	@Autowired
	Myrepo repo;
	void se()
	{
		  Student s=new Student();
		    s.setName("sanju");
		    s.setSurname("pawar");
		    s.setAge(22);
		    Address a=new Address();
		    a.setCity("pune");
		    a.setState("MH");
		    a.setCountry("India");
		    s.setAdd(List.of(a));
		    repo.save(s);
		    
	}
@GetMapping("/getAll")
public List<Student> getAll() {
    se();
    return repo.findAll();
}
@PostMapping("/add")
public String postMethodName(@RequestBody Student s) {
    //TODO: process POST request
    repo.save(s);
    return "Student saved";
}

  
}
