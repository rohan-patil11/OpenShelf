package com.ronny.services;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ronny.dao.BookDao;
import com.ronny.entity.Book;

@Service
public class BookServices {
	
	@Autowired
	SessionFactory factory;
	public void InsertBook(Book book){
		Session session = factory.openSession();
		session.persist(book);
		session.beginTransaction().commit();
		
	}
	@Autowired
	SessionFactory factory1;
	
	public Book FetchOneBook(int BookId) {
		Session session = factory1.openSession();
		Book b1 = session.get(Book.class, BookId);
		Transaction tx = session.beginTransaction();
		tx.commit();
		System.out.println("I am In Service");
		System.out.println("Book Id Is "+BookId);
		return b1;
		}

	@Autowired
	BookDao librarydao;
	public List<Book> FetchAllBooks(){
		List<Book> listOfBooks =librarydao.FetchAllBooks();
		return listOfBooks;	
	}
	
	@Autowired
	BookDao bookDao;
	public void AddMultipleBooks (List<Book> list){
		bookDao.AddMultipleBooks(list);
		
		
	}

}
