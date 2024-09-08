package com.project.rentalday.entitities;

import java.io.Serializable;

public class Payment implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String name;
	private String gender;
	private Double rentalday;
	private  Integer days;
	
	public Payment() {
		
	}

	public Payment(String name, String gender, Double rentalday, Integer days) {
		super();
		this.name = name;
		this.gender = gender;
		this.rentalday = rentalday;
		this.days = days;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Double getRentalday() {
		return rentalday;
	}

	public void setRentalday(Double rentalday) {
		this.rentalday = rentalday;
	}

	public Integer getDays() {
		return days;
	}

	public void setDays(Integer days) {
		this.days = days;
	}

	public Double getTotal() {
		return days * rentalday;
	}
}