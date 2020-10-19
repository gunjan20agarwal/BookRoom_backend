package com.book.bookroom.model;

import java.util.Collection;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Loaned_Book {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@ManyToMany
	private Set<Book> isbn;
	
	@ManyToMany
	private Collection<Member> member_id;
	private Date date_loaned;
	private Date date_due;
	private Date date_returned;
	
	@ManyToOne
	private Loan_Status loan_status_id;
	
	public Loaned_Book() {}
	
	public Loaned_Book(Set<Book> isbn, Collection<Member> member_id, Date date_loaned, Date date_due,
			Date date_returned, Loan_Status loan_status_id) {
		super();
		this.isbn = isbn;
		this.member_id = member_id;
		this.date_loaned = date_loaned;
		this.date_due = date_due;
		this.date_returned = date_returned;
		this.loan_status_id = loan_status_id;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Set<Book> getIsbn() {
		return isbn;
	}

	public void setIsbn(Set<Book> isbn) {
		this.isbn = isbn;
	}

	public Collection<Member> getMember_id() {
		return member_id;
	}

	public void setMember_id(Collection<Member> member_id) {
		this.member_id = member_id;
	}

	public Date getDate_loaned() {
		return date_loaned;
	}
	public void setDate_loaned(Date date_loaned) {
		this.date_loaned = date_loaned;
	}
	public Date getDate_due() {
		return date_due;
	}
	public void setDate_due(Date date_due) {
		this.date_due = date_due;
	}
	public Date getDate_returned() {
		return date_returned;
	}
	public void setDate_returned(Date date_returned) {
		this.date_returned = date_returned;
	}
	public Loan_Status getLoan_status_id() {
		return loan_status_id;
	}
	public void setLoan_status_id(Loan_Status loan_status_id) {
		this.loan_status_id = loan_status_id;
	}
	
	@Override
	public String toString() {
		return "Loaned_Book [id=" + id + ", isbn=" + isbn + ", member_id=" + member_id + ", date_loaned=" + date_loaned
				+ ", date_due=" + date_due + ", date_returned=" + date_returned + ", loan_status_id=" + loan_status_id
				+ "]";
	}
	
	
}
