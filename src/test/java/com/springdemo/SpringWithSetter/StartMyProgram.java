package com.springdemo.SpringWithSetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartMyProgram {
	
	
	public static void main(String[] args) {
		
			
		 System.out.println("Program Starting");
			
		 ApplicationContext context =  new ClassPathXmlApplicationContext("com/springdemo/SpringWithSetter/Configuration.xml");
		 
		 Mobile mobile = (Mobile)context.getBean("mobile1");
		 
		// System.out.println(mobile);
	 
		 System.out.println("Id : " + mobile.getId());
		 
		 System.out.println("Name : " + mobile.getName());
		 
		 System.out.println("Brand : " + mobile.getBrand());
		 
		
	}

}
