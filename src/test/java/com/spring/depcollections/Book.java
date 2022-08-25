package com.spring.depcollections;

import java.util.List;

public class Book {
	
	private int id;
	
	
	private String name;
	
	private List<String > chapters ;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getChapters() {
		return chapters;
	}

	public void setChapters(List<String> chapters) {
		this.chapters = chapters;
	}
	
	
	

}
