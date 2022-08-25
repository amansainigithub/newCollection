package com.spring.depcollections;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartCollectionClass {
	
	
	public static void main(String[] args) {
		
		 System.out.println("Program Starting");
			
		 ApplicationContext context =  new ClassPathXmlApplicationContext("com/spring/depcollections/Configuration3.xml");
		 
		 
		  Book book = (Book) context.getBean("book1");
		  
		  System.out.println("ID : "+ book.getId());
		  
		  System.out.println("NAME : "+ book.getName());
		  
		  List<String> chaperList =   book.getChapters();
		  
//		 Iterator<String> itr =   chaperList.iterator();
//		 
//		 while(itr.hasNext())
//		 {
//			
//			 System.out.println(itr.next());
//		 }
		 
		 //Second Way
//		 for(String str : chaperList)
//		 {
//			 System.out.println(str);
//		 }
		 
		 //Second Way
//		 for(int i =0 ; i<chaperList.size(); i++)
//		 {
//			 System.out.println(chaperList.get(i));
//		 }
		 
		 //Second Way
		chaperList.stream().forEach(System.out::println);
		 
		
	}

}
