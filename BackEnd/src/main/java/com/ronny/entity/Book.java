package com.ronny.entity;

import javax.persistence.Column;
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
	int bookId;
	
    @Column(name = "book_name", nullable=false)
	String bookName;
    
    @Column(name = "author_name",nullable=false)
	String authorName;
    
    @Column(name = "book_price",nullable=false)
	int bookPrice;
	
	public Book() {
		super();
	}

	public Book(String bookName, String authorName, int bookPrice) {
		super();
		this.bookName = bookName;
		this.authorName = authorName;
		this.bookPrice = bookPrice;
	}

	public Book(int bookId, String bookName, String authorName, int bookPrice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
		this.bookPrice = bookPrice;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", authorName=" + authorName + ", bookPrice="
				+ bookPrice + "]";
	}
	
	

}
