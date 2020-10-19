package com.book.bookroom.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class City {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String postal_code;
	private String city_name;
	
	@ManyToOne
	private Country country_id;
	
	public City() {}
	
	public City(String postal_code, String city_name, Country country_id) {
		super();
		this.postal_code = postal_code;
		this.city_name = city_name;
		this.country_id = country_id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPostal_code() {
		return postal_code;
	}
	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	public Country getCountry_id() {
		return country_id;
	}
	public void setCountry_id(Country country_id) {
		this.country_id = country_id;
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", postal_code=" + postal_code + ", city_name=" + city_name + ", country_id="
				+ country_id + "]";
	}
	
	
}
