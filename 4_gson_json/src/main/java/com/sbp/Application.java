package com.sbp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.google.gson.Gson;
import java.io.FileReader;
@SpringBootApplication
public class Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
		Gson g=new Gson();
		Student s=new Student();
//		s.setRoll_no(17);
//		s.setName("sanjana");
//		s.setMarks(100);
//		Address a=new Address();
//		a.setCity("surat");
//		a.setState("gujrat");
//		s.setAddress(a);
//	    String stud=g.toJson(s);
//	    System.out.println(stud);
		s=(Student)g.fromJson(new FileReader("Student.json"),Student.class );
		System.out.println("gson");
		System.out.println(s);
	}

}
