package com.ronny.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ronny.entity.Library;
import com.ronny.services.LibraryServices;

@RestController
public class LibraryController {
	
	@Autowired
	LibraryServices libraryServices2;
    @PostMapping("InsertBook")
	public void InsertBook(){
		libraryServices2.InsertBook();
	}
	
	@Autowired
	LibraryServices libraryServices1;
	@GetMapping("FetchOneBook/{id}")
	Library FetchOneBook(@PathVariable("id")int BookId) {
		libraryServices1.FetchOneBook(BookId);
		System.out.println("I am In Controller");
		return null;
	}
	
	@Autowired
	LibraryServices libraryservices;
	@GetMapping("FetchAllBooks")
	public List<Library> FetchAllBooks() {
		List<Library> Booklist=libraryservices.FetchAllBooks();
		return Booklist;
	}
	

}
