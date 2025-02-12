package com.ronny.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ronny.entity.Library;

@Repository
public class LibraryDao {
	
	@Autowired
	SessionFactory factrory;
	
	public List<Library> FetchAllBooks(){
		Session session=factrory.openSession();
		Criteria criteria = session.createCriteria(Library.class);
		List<Library> Booklist = criteria.list();
		
//		ArrayList<Library> listofBooks = new ArrayList<>();
//		listofBooks.add(new Library(1, "The God of Small Things", "Arundhati Roy", 499));
//		listofBooks.add(new Library(2, "Midnight’s Children", "Salman Rushdie", 599));
//		listofBooks.add(new Library(3, "Train to Pakistan", "Khushwant Singh", 399));
//		listofBooks.add(new Library(4, "Malgudi Days", "R.K. Narayan", 299));
//		listofBooks.add(new Library(5, "The White Tiger", "Aravind Adiga", 450));
//		listofBooks.add(new Library(6, "A Suitable Boy", "Vikram Seth", 699));
//		listofBooks.add(new Library(7, "The Guide", "R.K. Narayan", 350));
//		listofBooks.add(new Library(8, "Jaya: An Illustrated Retelling of the Mahabharata", "Devdutt Pattanaik", 550));
//		listofBooks.add(new Library(9, "I Too Had a Love Story", "Ravinder Singh", 299));
//		listofBooks.add(new Library(10, "The Palace of Illusions", "Chitra Banerjee Divakaruni", 499));
		return Booklist;
		
	}

}
