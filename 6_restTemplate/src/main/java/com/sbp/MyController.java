package com.sbp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyController {
     @Value("${basicrest.get.endpoint.getStudent}")
     String url;
	@GetMapping("/getstudfrom")
	void getStudFrom()
	{
		RestTemplate r=new RestTemplate();
		ResponseEntity<Student> res=r.getForEntity(url,Student.class);
		if(res.getStatusCodeValue()==200)
		{
			Student s=res.getBody();
			System.out.println("Student from basic rest to resttemplete:"+s);
		}
		
	}	
	@GetMapping("/test")
	String test()
	{
		return "running rest app";
	}
	
	
}
