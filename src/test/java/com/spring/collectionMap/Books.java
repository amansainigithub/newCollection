package com.spring.collectionMap;

import java.util.Map;

public class Books {
	
	private int id;
	
	private String bookName;
	
	private Map<String, String> chapters;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Map<String, String> getChapters() {
		return chapters;
	}

	public void setChapters(Map<String, String> chapters) {
		this.chapters = chapters;
	}

	
}
