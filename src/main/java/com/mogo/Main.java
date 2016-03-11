package com.mogo;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mogo.Entity.Book;
import com.mogo.Entity.Person.NotEnoughWillPowerExectiopn;
import com.mogo.service.Reader;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans-config.xml");
		Reader reader = (Reader) context.getBean("John");
		Book book2 = (Book) context.getBean("book2");
		Book book3 = (Book) context.getBean("book3");
		reader.readFavouriteBook();
		reader.read(book2);
		try{
			reader.read(book3);
		}catch(NotEnoughWillPowerExectiopn e){
			
		}
		
	}
}
