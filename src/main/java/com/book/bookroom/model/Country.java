package com.book.bookroom.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Country {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String country_name;

	public Country() {}

	public Country(String country_name) {
		this.country_name = country_name;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountry_name() {
		return country_name;
	}

	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", country_name=" + country_name + "]";
	}
	
	
	
	
	
}
