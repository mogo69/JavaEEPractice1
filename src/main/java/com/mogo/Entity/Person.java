package com.mogo.Entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.mogo.service.Reader;
@Component
public class Person implements Reader {

	private int willPower = 3;
	@Autowired
	@Qualifier("book1")
	private Book favouriteBook;

	public Person() {
	}
	
	public Person(int willPower) {
		this.willPower = willPower;
	}

	public void read(Book book) {
		if (willPower < 1) {
			System.out.println("I cannot read any moooooore!");
		} else {
			willPower--;
			System.out.println("I have just read " + book.getTitle());
		}
	}

	public int getWillPower() {
		return willPower;
	}

	public void setWillPower(int willPower) {
		this.willPower = willPower;
	}


	public void setFavoriteBook(Book favouriteBook) {
		this.favouriteBook = favouriteBook;
	}
	
	public Book getFavoriteBook() {
		return favouriteBook;
	}


	public void readFavouriteBook() {
		this.read(getFavoriteBook());	
	}

}
