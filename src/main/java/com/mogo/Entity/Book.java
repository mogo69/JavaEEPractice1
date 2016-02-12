package com.mogo.Entity;

import org.springframework.stereotype.Component;

@Component
public class Book {
	
	private String title;
	
	public Book(){
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public String getTitle(){
		return title;
	}

}
