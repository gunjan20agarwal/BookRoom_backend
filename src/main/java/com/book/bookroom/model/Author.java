package com.book.bookroom.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Author {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String author_name;
	private String author_surname;
	private Date date_birth;
	private Date date_death;
	
	@ManyToMany
	private Set<Book> books=new HashSet<Book>();
	
	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}

	public Author() {}
	
	public Author(String author_name, String author_surname, Date date_birth, Date date_death) {
		super();
		this.author_name = author_name;
		this.author_surname = author_surname;
		this.date_birth = date_birth;
		this.date_death = date_death;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAuthor_name() {
		return author_name;
	}
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
	public String getAuthor_surname() {
		return author_surname;
	}
	public void setAuthor_surname(String author_surname) {
		this.author_surname = author_surname;
	}
	public Date getDate_birth() {
		return date_birth;
	}
	public void setDate_birth(Date date_birth) {
		this.date_birth = date_birth;
	}
	public Date getDate_death() {
		return date_death;
	}
	public void setDate_death(Date date_death) {
		this.date_death = date_death;
	}
	
	@Override
	public String toString() {
		return "Author [id=" + id + ", author_name=" + author_name + ", author_surname=" + author_surname
				+ ", date_birth=" + date_birth + ", date_death=" + date_death + "]";
	}
	

	
	
	
	

}
