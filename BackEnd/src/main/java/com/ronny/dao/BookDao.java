package com.ronny.dao;



import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.ronny.entity.Book;
import com.ronny.entity.Student;

@Repository
public class BookDao {
	
	@Autowired
	SessionFactory factory;
	
	public List<com.ronny.dto.Book> FetchAllBooks(){
		Session session=factory.openSession();
		Criteria criteria = session.createCriteria(Book.class);
		
		
		List<com.ronny.dto.Book> books = new ArrayList<>();
		
		List<Book> Booklist = criteria.list();
		
		for (Book book : Booklist) {
			
			Student st = book.getStudent();
			com.ronny.dto.Book b= new com.ronny.dto.Book();
			b.setBookId(book.getBookId());
			b.setBookName(book.getBookName());
			b.setAuthorName(book.getAuthorName());
			b.setBookPrice(book.getBookPrice());
			
			com.ronny.dto.Student studentdto = new com.ronny.dto.Student();
			studentdto.setStudentId(st.getStudentId());
			studentdto.setFirstName(st.getFirstName());
			studentdto.setLastName(st.getLastName());
			studentdto.setCourse(st.getCourse());
			
			b.setStudent(studentdto);
			
			books.add(b);
		}
		
		
		return books;
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


	public void AssignBook(int bookId, int studentId,String assignedBook1) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Book book = session.get(Book.class,bookId);
		Student student = session.get(Student.class,studentId);
		student.setAssignedBook(assignedBook1);
		book.setStudent(student);
		session.update(book);
		tx.commit();
	}

}
