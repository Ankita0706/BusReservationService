package com.capgemini.Bus.Reservation.entity;

import java.math.BigInteger;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_Id")
	private int userId;
	
	@Column(name = "f_Name")
	private String fname;
	
	@Column(name = "l_Name")
	private String lname;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "phone_No")
	private BigInteger phoneno;
	
	@Column(name = "DOB")
	private Date DOB;
	
	@Column(name = "adhar_Card_No")
	private BigInteger adharcardno;

	public User(String fname, String lname, String username, String password, String email, BigInteger phoneno,
			Date dOB, BigInteger adharcardno) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phoneno = phoneno;
		DOB = dOB;
		this.adharcardno = adharcardno;
	}

	public User() {
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public BigInteger getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(BigInteger phoneno) {
		this.phoneno = phoneno;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public BigInteger getAdharcardno() {
		return adharcardno;
	}

	public void setAdharcardno(BigInteger adharcardno) {
		this.adharcardno = adharcardno;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", fname=" + fname + ", lname=" + lname + ", username=" + username
				+ ", password=" + password + ", email=" + email + ", phoneno=" + phoneno + ", DOB=" + DOB
				+ ", adharcardno=" + adharcardno + "]";
	}
	
	
	

	

}
