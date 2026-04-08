package com.sbp;

import java.io.File;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

@SpringBootApplication
public class Application {

	public static void main(String[] args)throws Exception {
		SpringApplication.run(Application.class, args);
//		Person p=new Person();
//		p.setId(17);
//		p.setName("sanjana");
//		p.setSurname("Pawar");
//		p.setAge(22);
//		Address a=new Address();
//		a.setCity("pune");
//		a.setState("MH");
//		p.setAdd(a);
		JAXBContext jc=JAXBContext.newInstance(Person.class);
//		Marshaller m=jc.createMarshaller();
//		m.marshal(p,new File("Person.xml"));
//		System.out.println("File created");
		Unmarshaller u=jc.createUnmarshaller();
		Person p2=(Person) u.unmarshal(new File("Person.xml"));
		System.out.println(p2);
	}

}
