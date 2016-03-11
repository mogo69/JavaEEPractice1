package com.mogo.Entity;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Spy {

	@Pointcut("execution(* readFavouriteBook(..))")
	private void readFavouriteBook() {
	}
	
	@Pointcut("execution(* com.mogo.Entity.Person.read(..)) && args(book,..)")
	private void readBook(Book book) {
	}

	@Before("readFavouriteBook()")
	public void spy() {
		System.out.println("Spy:Smb is reading his favorite book");
	}

	@Before("readBook(book)")
	public void spy2(Book book) {
		System.out.println("Spy:Smb is reading " + book.getTitle());
	}

	@AfterReturning("readFavouriteBook()")
	public void spy3() {
		System.out.println("Spy:Smb has finished reading.");
	}
	@AfterReturning("readBook(book)")
	public void spy4(Book book) {
		System.out.println("Spy:Smb has finished reading " + book.getTitle());
	}
	

	@AfterThrowing("readBook(book)")
	public void demandRefund(Book book) { 
		System.out.println("Spy:Smb has not enough willpower to read " + book.getTitle());
	}

}
