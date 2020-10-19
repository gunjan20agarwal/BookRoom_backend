package com.book.bookroom.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Member {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String password;
	private String gender;
	private Date dob; 
	private String address;
	
	@ManyToOne
	private City city_id;
	private String email_address;
	private String phone_number;
	
	@ManyToOne
	private Plan_Details plan_id;
	private boolean isEnabled;
	
	public Member() {}

	public Member(String name, String password, String gender, Date dob, String address, City city_id,
			String email_address, String phone_number, boolean isEnabled) {
		super();
		this.name = name;
		this.password = password;
		this.gender = gender;
		this.dob = dob;
		this.address = address;
		this.city_id = city_id;
		this.email_address = email_address;
		this.phone_number = phone_number;
		this.isEnabled = isEnabled;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public boolean isEnabled() {
		return isEnabled;
	}

	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public City getCity_id() {
		return city_id;
	}

	public void setCity_id(City city_id) {
		this.city_id = city_id;
	}

	public String getEmail_address() {
		return email_address;
	}

	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public Plan_Details getPlan_id() {
		return plan_id;
	}

	public void setPlan_id(Plan_Details plan_id) {
		this.plan_id = plan_id;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", password=" + password + ", gender=" + gender + ", dob=" + dob
				+ ", address=" + address + ", city_id=" + city_id + ", email_address=" + email_address
				+ ", phone_number=" + phone_number + ", isEnabled=" + isEnabled + "]";
	}
	
	
	
	
}

