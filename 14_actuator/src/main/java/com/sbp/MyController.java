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
	  empRepo repo;
       @GetMapping("/employee")
       public List<Employee>  getEmp(@RequestParam String param) {
           return repo.findByName(param);
       }
      @PostMapping("/addEmp")
      public String postEmp(@RequestBody Employee e) {
          //TODO: process POST request
          repo.save(e);
          return "employee saved";
      }
      @PostMapping("/addEmpall")
      public String postEmpall(@RequestBody List<Employee> e) {
          //TODO: process POST request
          repo.saveAll(e);
          return "employee saved";
      }
      
}
