package com.book.bookroom.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Publisher {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String publishingHouseName;

	@ManyToOne
	private City city_id;
	
	public Publisher() {}
	
	public Publisher(String publishingHouseName, City city_id) {
		super();
		this.publishingHouseName = publishingHouseName;
		this.city_id = city_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPublishingHouseName() {
		return publishingHouseName;
	}
	public void setPublishingHouseName(String publishingHouseName) {
		this.publishingHouseName = publishingHouseName;
	}
	public City getCityId() {
		return city_id;
	}
	public void setCityId(City city_id) {
		this.city_id = city_id;
	}

	@Override
	public String toString() {
		return "Publisher [id=" + id + ", publishingHouseName=" + publishingHouseName + ", city=" + city_id + "]";
	}

	
	
}
