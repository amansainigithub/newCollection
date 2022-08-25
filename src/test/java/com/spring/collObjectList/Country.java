package com.spring.collObjectList;

import java.util.List;

public class Country {
	
	private Long id;
	
	private String countryName;
	
	
	List<State> state;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCountryName() {
		return countryName;
	}


	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}


	public List<State> getState() {
		return state;
	}


	public void setState(List<State> state) {
		this.state = state;
	}
	
	
	

}
