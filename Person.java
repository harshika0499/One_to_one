package com.mappi.dto;

import javax.persistence.Id;
import javax.persistence.OneToOne;



public class Person
{
	@Id
	int id;
	String name;

	@OneToOne
	Pancard pan;

	public Pancard getPan() {
		return pan;
	}

	public void setPan(Pancard pan) {
		this.pan = pan;
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



}
