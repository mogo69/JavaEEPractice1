package com.mogo.Entity;

import java.util.ArrayList;
import java.util.List;

import com.mogo.service.Reader;

public class Person implements Reader {

	private int willPower;
	private ArrayList<Book> books;

	public Person(int willPower) {
		this.willPower = willPower;
	}

	@Override
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

	public ArrayList getBooks() {
		return books;
	}

	public void setBooks(ArrayList books) {
		this.books = books;
	}

	@Override
	public void read(List<Book> books) {
		for (Book b : books) {
			read(b);
		}

	}

	@Override
	public List<Book> getFavoriteBooks() {
		return books;
	}

}
