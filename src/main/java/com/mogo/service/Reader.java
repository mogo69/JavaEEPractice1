package com.mogo.service;

import java.util.List;

import com.mogo.Entity.Book;

public interface Reader {
	public void read(Book book);
	public void read(List<Book> books);
	public List<Book> getFavoriteBooks();
}
