package com.book.bookroom.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class SubCategory {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@ManyToOne
	private Category category_id;
	
	private String subCategory_name;
	
	public SubCategory() {}

	
	public SubCategory(Category category_id, String subCategory_name) {
		this.category_id = category_id;
		this.subCategory_name = subCategory_name;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubCategory_name() {
		return subCategory_name;
	}

	public void setSubCategory_name(String subCategory_name) {
		this.subCategory_name = subCategory_name;
	}
	
	public Category getCategory_id() {
		return category_id;
	}

	public void setCategory_id(Category category_id) {
		this.category_id = category_id;
	}

	@Override
	public String toString() {
		return "SubCategory [id=" + id + ", subCategory_name=" + subCategory_name + "]";
	}	
}
