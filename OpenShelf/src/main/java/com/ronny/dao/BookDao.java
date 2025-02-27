package com.ronny.dao;


import java.io.Serializable;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ronny.entity.Book;
import com.ronny.services.BookServices;

@Repository
public class BookDao {
	
	@Autowired
	SessionFactory factrory;
	
	public List<Book> FetchAllBooks(){
		Session session=factrory.openSession();
		Criteria criteria = session.createCriteria(Book.class);
		List<Book> Booklist = criteria.list();
		return Booklist;
	}	
	@Autowired
	SessionFactory factory1;
	
	public void AddMultipleBooks(List<Book> list){
		Session session = factory1.openSession();
		Transaction tx = session.beginTransaction();
		for (Book book : list) {
			session.save(book);
		}
		tx.commit();	
	}

}
