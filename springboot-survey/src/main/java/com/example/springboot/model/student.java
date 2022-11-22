// Main class file for the Student application - back end


package com.example.springboot.model;

import javax.persistence.*;
@Entity
@Table(name = "students")
public class student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Column(name = "fname")
	private String fname;
	@Column(name = "lname")
	private String lname;
	@Column(name = "address")
	private String address;
	@Column(name = "city")
	private String city;
	@Column(name = "state")
	private String state;
	@Column(name = "zip")
	private String zip;
	@Column(name = "phone")
	private String phone; 
	@Column(name = "email")
	private String email;
	public String getCampus1() {
		return campus1;
	}
	public void setCampus1(String campus1) {
		this.campus1 = campus1;
	}
	public String getCampus2() {
		return campus2;
	}
	public void setCampus2(String campus2) {
		this.campus2 = campus2;
	}
	public String getCampus3() {
		return campus3;
	}
	public void setCampus3(String campus3) {
		this.campus3 = campus3;
	}
	public String getCampus4() {
		return campus4;
	}
	public void setCampus4(String campus4) {
		this.campus4 = campus4;
	}
	public String getCampus5() {
		return campus5;
	}
	public void setCampus5(String campus5) {
		this.campus5 = campus5;
	}
	public String getRating1() {
		return rating1;
	}
	public void setRating1(String rating1) {
		this.rating1 = rating1;
	}
	public String getRating2() {
		return rating2;
	}
	public void setRating2(String rating2) {
		this.rating2 = rating2;
	}
	public String getRating3() {
		return rating3;
	}
	public void setRating3(String rating3) {
		this.rating3 = rating3;
	}
	private String date;
	private String campus;
	private String campus1;
	private String campus2;
	private String campus3;
	private String campus4;
	private String campus5;
	private String rating;

	private String rating1;

	private String rating2;

	private String rating3;
	private String know;
	private int ruffle;
	private String comment;
	public student() {}
	public student(String fname, String lname, String address, String city, String state, String zip, String phone,
			String email, String date, String campus, String campus1, String campus2, String campus3,String campus4,
			String campus5, String rating, String rating1,String rating2,String rating3, String know, int ruffle, String comment) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
		this.email = email;
		this.date = date;
		this.campus = campus;
		this.campus1 = campus1;
		this.campus2 = campus2;
		this.campus3 = campus3;
		this.campus4 = campus4;
		this.campus5 = campus5;
		this.rating = rating;
		this.rating1 = rating1;
		this.rating2 = rating2;
		this.rating3 = rating3;

		this.know = know;
		this.ruffle = ruffle;
		this.comment = comment;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCampus() {
		return campus;
	}
	public void setCampus(String campus) {
		this.campus = campus;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getKnow() {
		return know;
	}
	public void setKnow(String know) {
		this.know = know;
	}
	public int getRuffle() {
		return ruffle;
	}
	public void setRuffle(int ruffle) {
		this.ruffle = ruffle;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
 	
}
