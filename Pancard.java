package com.mappi.dto;

import javax.persistence.Id;
import javax.persistence.OneToOne;



public class Pancard 
{
	@Id
    int id;
    String pno;
    String dob;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPno() {
		return pno;
	}
	public void setPno(String pno) {
		this.pno = pno;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
    
}
