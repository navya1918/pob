package com.cg.model;

public class Athlete {
	int atheleteId;
	String atheleteName;
	String gender;
	String email;
	long  mobilenumber;
	public int getAtheleteId() {
		return atheleteId;
	}
	public void setAtheleteId(int atheleteId) {
		this.atheleteId = atheleteId;
	}
	public String getAtheleteName() {
		return atheleteName;
	}
	public void setAtheleteName(String atheleteName) {
		this.atheleteName = atheleteName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(int mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public Athlete() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Athlete(int atheleteId, String atheleteName, String gender, String email, long l) {
		super();
		this.atheleteId = atheleteId;
		this.atheleteName = atheleteName;
		this.gender = gender;
		this.email = email;
		this.mobilenumber = l;
	}
	@Override
	public String toString() {
		return " [atheleteId=" + atheleteId + ", atheleteName=" + atheleteName + ", gender=" + gender
				+ ", email=" + email + ", mobilenumber=" + mobilenumber + "]";
	}
	
	
	

}
