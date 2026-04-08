package com.sbp;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.Stack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.sbp.*;
@SpringBootApplication
public class Application {

	public static void main(String[] args) throws Exception{
		SpringApplication.run(Application.class, args);
		//System.out.println("Hii");
       Student s=new Student();
//		s.setRoll_no(17);
//		s.setName("sanjana");
//		s.setMarks(100);
//		Address a=new Address();
//		a.setCity("surat");
//		a.setState("gujrat");
//		s.setAddress(a);
		ObjectMapper mapper = new ObjectMapper();
		//mapper.writeValue(new File("Student.json"), s);
		s=(Student)mapper.readValue(new File("Student.json"), Student.class);
		System.out.println(s);
		
	}

}
