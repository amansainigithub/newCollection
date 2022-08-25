package com.spring.collectionMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartMapCollection {
	
	public static void main(String[] args) {
		
		System.out.println("Program Starting");
		
		 ApplicationContext context =  new ClassPathXmlApplicationContext("com/spring/collectionMap/Configuration4.xml");
		 
		 
		  Books book = (Books) context.getBean("book1");
		  
		  System.out.println("Book ID" + book.getId());
		  
		  System.out.println("Book Name : " + book.getBookName());
		  
		  //System.out.println("chapters" + book.getChapters());
		  
		  Map<String, String> mapData = book.getChapters();
		  
		  Set<Entry<String, String>> setData=mapData.entrySet();  
		  
		  Iterator<Entry<String, String>> itr=setData.iterator();  
		    while(itr.hasNext()){  
		        Entry<String,String> entry=itr.next();  
		        System.out.println("KEYS :"+entry.getKey()+" =========== VALUES By : "+entry.getValue());  
		    }  
//		    
		  
		  //Understand
//		  for (String key : mapData.keySet()) {
//		        System.out.println(key + ":" + mapData.get(key));
//		    }
		  
		    
		    //2nd Way
//		    for (Map.Entry<String,String> entry : mapData.entrySet()) {
//	            System.out.println("Key Data : " + entry.getKey() +
//	                             ", Value Data : " + entry.getValue());
//			}
//	
	
		  //third way
		    //mapData.forEach((k, v) -> System.out.println(("Keys "+ k + ": Values : " + v)));
				
	
		  
		  
	}
}


