package com.project.rentalday.entitities;

import java.io.Serializable;

public class Books implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	private Long id;
	private String name;
	private String gender;
	private Double rentalday;
	
	public Books() {
		
	}

	public Books(Long id, String name, String gender, Double rentalday) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.rentalday = rentalday;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((rentalday == null) ? 0 : rentalday.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Books other = (Books) obj;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rentalday == null) {
			if (other.rentalday != null)
				return false;
		} else if (!rentalday.equals(other.rentalday))
			return false;
		return true;
	}

}