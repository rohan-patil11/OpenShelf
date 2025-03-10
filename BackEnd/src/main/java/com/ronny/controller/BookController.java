package com.ronny.controller;


import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ronny.entity.Book;
import com.ronny.services.BookServices;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BookController {
	
	@Autowired
	BookServices bookServices;
	
    @PostMapping("InsertBook")
	public Book InsertBook(@RequestBody Book book){
    	bookServices.InsertBook(book);
		return book;
	}
	
	
	@GetMapping("FetchOneBook/{BookId}")
	Book FetchOneBook(@PathVariable int BookId) {
		Book b1 = bookServices.FetchOneBook(BookId);
		return b1;
	}
	
	
	@GetMapping("FetchAllBooks")
	public List<Book> FetchAllBooks() {
		List<Book> Booklist=bookServices.FetchAllBooks();
		return Booklist;
	}
	
	@Autowired
	BookServices bookservices3;
	@PostMapping("AddMultipleBooks")
	public List<Book> AddMultipleBooks(@RequestBody List<Book> list){
		bookServices.AddMultipleBooks(list);
		return list;	
	}
}
