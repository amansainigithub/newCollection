package com.spring.collObjectList;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunningClassObjectCollection {
	
	
	public static void main(String[] args) {
		System.out.println("Program Starting");
		
		 ApplicationContext context =  new ClassPathXmlApplicationContext("com/spring/collObjectList/Configuration5.xml");
		 
		 
		  Country book = (Country) context.getBean("country");
		  
		  System.out.println(" id : " + book.getId());
		  
		  System.out.println(" Country Name : " + book.getCountryName());
		  
		  List<State> stateList =  book.getState();
		  
//		  Iterator itr = stateList.iterator();
//		  
//		  while(itr.hasNext())
//		  {
//			  State state = (State)itr.next();
//			  System.out.println(state.getStateName());
//		  }
		  
		  
//		  for(State state : stateList)
//		  {
//			  	System.out.println(state.getStateName());
//		  }
		  
		  
//		  stateList.forEach(a-> System.out.println(a.getStateName()));
		  
		  
		 // stateList.stream().forEach(System.out :: println);
		  
	}

}
