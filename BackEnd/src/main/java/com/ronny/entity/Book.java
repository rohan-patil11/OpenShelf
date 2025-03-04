package com.ronny.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int BookId;
	String BookName;
	String AuthorName;
	int BookPrice;
	
	public Book() {
		super();
	}
	
	public Book(String bookName, String authorName, int bookPrice) {
		super();
		BookName = bookName;
		AuthorName = authorName;
		BookPrice = bookPrice;
	}

	public Book(int bookId, String bookName, String authorName, int bookPrice) {
		super();
		BookId = bookId;
		BookName = bookName;
		AuthorName = authorName;
		BookPrice = bookPrice;
	}

	public int getBookId() {
		return BookId;
	}
	public void setBookId(int bookId) {
		BookId = bookId;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getAuthorName() {
		return AuthorName;
	}
	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}
	public int getBookPrice() {
		return BookPrice;
	}
	public void setBookPrice(int bookPrice) {
		BookPrice = bookPrice;
	}

	@Override
	public String toString() {
		return "Library [BookId=" + BookId + ", BookName=" + BookName + ", AuthorName=" + AuthorName + ", BookPrice="
				+ BookPrice + "]";
	}
	

}
