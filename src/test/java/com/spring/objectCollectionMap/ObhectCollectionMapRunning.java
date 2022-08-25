package com.spring.objectCollectionMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ObhectCollectionMapRunning {
	
	public static void main(String[] args) {
		
		
		 System.out.println("Program Starting");
			
		 ApplicationContext context =  new ClassPathXmlApplicationContext("com/spring/objectCollectionMap/Configuration6.xml");
		 
		 House house = (House)context.getBean("house");
		 
		 System.out.println("House name : " + house.getHouseName());
		 
		 Map<Address, Owner> mapData =  house.getMapData();
		 Set<Entry<Address, Owner>> set= mapData.entrySet();
		    Iterator<Entry<Address, Owner>> itr= set.iterator();  
		    
//		    while(itr.hasNext()){  
//		        Entry<Address, Owner> entry=itr.next();  
//		        Address ans=entry.getKey();  
//		        Owner user=entry.getValue();  
//		        System.out.println("===> Address : " + ans.getAddress()); 
//		        System.out.println("===> OWNER : " + user.getOwnerName());  
//		    }  
//		    
		    
//		    
//		    for (Map.Entry<Address, Owner> entry : mapData.entrySet()) {
//		        System.out.println("KEYS "+ entry.getKey() + ": VALUES" + entry.getValue());
//		    }
		    
//		    mapData.forEach((k,v)-> System.out.println("KEYS : " + k.getAddress() +" : VALUES : "+ v.getOwnerName()));
		    
		  //  mapData.entrySet().stream().forEach(a->System.out.println("KEY ==> " + a.getKey() +"VALUES == > "+ a.getValue()));
		    
		    
		 
	}
	

}
