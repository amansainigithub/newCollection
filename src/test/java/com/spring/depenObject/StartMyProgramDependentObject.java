package com.spring.depenObject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartMyProgramDependentObject {
	
		
	
	public static void main(String[] args) {
		
		
		 System.out.println("Program Starting");
			
		 ApplicationContext context =  new ClassPathXmlApplicationContext("com/spring/depenObject/Configuration2.xml");
		 
		  Laptop laptop = 	(Laptop)context.getBean("laptop1");
		  
		  System.out.println("ID :  "+ laptop.getId());
		  
		  System.out.println("Laptop Name: "+laptop.getLaptopName());
		  	
		  
		  //Battery Data
		  System.out.println("Battery ID :  "+ laptop.getBattery().getId());
		  
		  System.out.println("Battery MODEL :  "+ laptop.getBattery().getBatteryModel());
		 
		
	}

}
