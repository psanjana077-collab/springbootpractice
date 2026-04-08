package com.sbp;

import org.springframework.stereotype.Service;

@Service
public class MyService  {
           public String Validation(int age) throws Exception
           {
        	   System.out.println("Validation Executed");
        	   if(age>=18)
        	   {
        		   return "you are leaglly adult";
        	   }
        	   else
        	   {
        		   throw new CustomException("you are not adult");
        	   }
           }
}
