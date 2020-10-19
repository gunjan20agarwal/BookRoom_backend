package com.book.bookroom.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Book {
	
	@Id
	private int isbn;
	private String book_title;
	
	@ManyToOne
	private SubCategory subCategoryId;
	
	@ManyToOne
	private Publisher publishing_house_id;
	
	private Date year_published;
		
	public Book() {}
	
	public Book(int isbn, String book_title, SubCategory subCategoryId, Publisher publishing_house_id, Date year_published) {
		this.isbn = isbn;
		this.book_title = book_title;
		this.subCategoryId = subCategoryId;
		this.publishing_house_id = publishing_house_id;
		this.year_published = year_published;
	}

	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getBook_title() {
		return book_title;
	}
	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}
	
	public int getSubCategoryId() {
		return subCategoryId.getId();
	}

	public void setSubCategory_id(SubCategory subCategory_id) {
		this.subCategoryId = subCategoryId;
	}

	
	
	public Publisher getPublishing_house_id() {
		return publishing_house_id;
	}




	public void setPublishing_house_id(Publisher publishing_house_id) {
		this.publishing_house_id = publishing_house_id;
	}




	public Date getYear_published() {
		return year_published;
	}
	public void setYear_published(Date year_published) {
		this.year_published = year_published;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", book_title=" + book_title + ", subCategory_id=" + subCategoryId
				+ ", publishing_house_id=" + publishing_house_id + ", year_published=" + year_published + "]";
	}
	
	
	

}
