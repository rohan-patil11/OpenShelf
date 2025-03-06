package com.ronny.dao;



import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.ronny.entity.Book;

@Repository
public class BookDao {
	
	@Autowired
	SessionFactory factory;
	
	public List<Book> FetchAllBooks(){
		Session session=factory.openSession();
		Criteria criteria = session.createCriteria(Book.class);
		List<Book> Booklist = criteria.list();
		return Booklist;
	}	

	
	public List<Book> AddMultipleBooks(List<Book> list){
		System.out.println("Recieved Data: "+ list);
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		for (Book book : list) {
			session.save(book);
		}
		tx.commit();
		System.out.println("data saved succesfully");

		return list;
	}

}
