package com.ronny.services;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ronny.dao.LibraryDao;
import com.ronny.entity.Library;

@Service
public class LibraryServices {
	
	@Autowired
	SessionFactory factory;
	public void InsertBook(){
		Session session = factory.openSession();
		Library b1 = new Library("The God of Small Things", "Arundhati Roy", 499);
		session.persist(b1);
		session.beginTransaction().commit();
		
	}
	public Library FetchOneBook(int BookId) {
		System.out.println("I am In Service");
		System.out.println("Book Id Is "+BookId);
		return null;
		}

	@Autowired
	LibraryDao librarydao;
	public List<Library> FetchAllBooks(){
		List<Library> listOfBooks =librarydao.FetchAllBooks();
		return listOfBooks;	
	}

}
