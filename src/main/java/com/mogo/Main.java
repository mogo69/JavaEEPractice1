package com.mogo;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mogo.Entity.Book;
import com.mogo.service.Reader;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans-config.xml");
		Reader reader = (Reader) context.getBean("John");
		Book someBook = (Book) context.getBean("book1");
		reader.read(someBook);
		reader.read(reader.getFavoriteBooks());
	}
}
