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
	BookServices libraryServices2;
    @PostMapping("/InsertBook")
	public void InsertBook(@RequestBody Book book){
		libraryServices2.InsertBook(book);
	}
	
	@Autowired
	BookServices libraryServices1;
	@GetMapping("/FetchOneBook/{BookId}")
	Book FetchOneBook(@PathVariable int BookId) {
		Book b1 = libraryServices1.FetchOneBook(BookId);
		System.out.println("I am In Controller");
		return b1;
	}
	
	@Autowired
	BookServices libraryservices;
	@GetMapping("/FetchAllBooks")
	public List<Book> FetchAllBooks() {
		List<Book> Booklist=libraryservices.FetchAllBooks();
		return Booklist;
	}
	
	@Autowired
	BookServices bookservices3;
	@PostMapping("/AddMultipleBooks")
	public void AddMultipleBooks(@RequestBody List<Book> list){
		bookservices3.AddMultipleBooks(list);	
	}
}
