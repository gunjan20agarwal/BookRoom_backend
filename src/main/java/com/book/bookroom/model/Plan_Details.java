package com.book.bookroom.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Plan_Details {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String plan_name;
	private float amount;
	private String validity;
	private String benefits;
	
	public Plan_Details() {}
	
	public Plan_Details(String plan_name, float amount, String validity, String benefits) {
		super();
		this.plan_name = plan_name;
		this.amount = amount;
		this.validity = validity;
		this.benefits = benefits;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlan_name() {
		return plan_name;
	}

	public void setPlan_name(String plan_name) {
		this.plan_name = plan_name;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getValidity() {
		return validity;
	}

	public void setValidity(String validity) {
		this.validity = validity;
	}

	public String getBenefits() {
		return benefits;
	}

	public void setBenefits(String benefits) {
		this.benefits = benefits;
	}

	@Override
	public String toString() {
		return "Plan_Details [id=" + id + ", plan_name=" + plan_name + ", amount=" + amount + ", validity=" + validity
				+ ", benefits=" + benefits + "]";
	}

}
