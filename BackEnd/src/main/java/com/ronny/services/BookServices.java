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
	BookDao bookDao;
	
	@Autowired
	SessionFactory factory;
	
	public Book InsertBook(Book book){
		Session session = factory.openSession();
		session.persist(book);
		session.beginTransaction().commit();
		return book;
		
	}
	
	public Book FetchOneBook(int BookId) {
		Session session = factory.openSession();
		Book b1 = session.get(Book.class, BookId);
		Transaction tx = session.beginTransaction();
		tx.commit();
		System.out.println("I am In Service");
		System.out.println("Book Id Is "+BookId);
		return b1;
		}

	public List<com.ronny.dto.Book> FetchAllBooks(){
		List<com.ronny.dto.Book> listOfBooks =bookDao.FetchAllBooks();
		return listOfBooks;	
	}
	
	
	public List<Book> AddMultipleBooks (List<Book> list){
		bookDao.AddMultipleBooks(list);
		return list;
		
		
	}

	public void AssignBook(int bookId, int studentId) {
		bookDao.AssignBook(bookId,studentId);
	
	}

}
