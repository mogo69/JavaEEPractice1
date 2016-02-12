package com.mogo.service;

import java.util.List;

import com.mogo.Entity.Book;

public interface Reader {
	public void readFavouriteBook();
	public void read(Book book);
	public Book getFavoriteBook();
}
