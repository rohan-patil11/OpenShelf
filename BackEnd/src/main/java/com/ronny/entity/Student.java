package com.ronny.entity;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Component
@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int studentId;
	String firstName;
	String lastName;
	String course;
	String assignedBook;
	
	@OneToOne(mappedBy="student")
	@JsonManagedReference
	private Book book;
	
	
	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Student() {
		super();
	}
	
	public Student(int studentId, String firstName, String lastName, String department,String course) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.course = course;
	}
	
	public Student(String firstName, String lastName, String department,String course) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", department=" + course + "]";
		
	
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getAssignedBook() {
		return assignedBook;
	}

	public void setAssignedBook(String assignedBook) {
		this.assignedBook = assignedBook;
	}

	
}
