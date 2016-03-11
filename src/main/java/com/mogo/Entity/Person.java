package com.mogo.Entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.mogo.service.Reader;
@Component
public class Person implements Reader {

	private int willPower = 2;
	@Autowired
	@Qualifier("book1")
	private Book favouriteBook;

	public Person() {
	}
	
	public Person(int willPower) {
		this.willPower = willPower;
	}

	public class NotEnoughWillPowerExectiopn extends RuntimeException{

		private static final long serialVersionUID = 1L;
		public NotEnoughWillPowerExectiopn(){
			super();
		}
		public NotEnoughWillPowerExectiopn(String message){
			super(message);
		}
	}
	
	public void read(Book book) throws NotEnoughWillPowerExectiopn{
		if (willPower < 1) {
			throw new NotEnoughWillPowerExectiopn("Not enough will power");
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


	public void setFavoriteBook(Book book) {
		this.favouriteBook = book;
	}
	
	public Book getFavoriteBook() {
		return favouriteBook;
	}


	public void readFavouriteBook() {
		this.read(getFavoriteBook());	
	}

}
