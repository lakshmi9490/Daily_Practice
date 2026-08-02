package com.web.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "uId")
	private int uId;
	@Column(name = "uName")
	private String uName;
	@Column(name = "uEmail")
	private String uEmail;
	@Column(name = "password")
	private String password;
	
	
	public User() {
		super();
	}
	public User(String uName, String uEmail, String password) {
		super();
		this.uName = uName;
		this.uEmail = uEmail;
		this.password = password;
	}
	public User(int uId, String uName, String uEmail, String password) {
		super();
		this.uId = uId;
		this.uName = uName;
		this.uEmail = uEmail;
		this.password = password;
	}
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuEmail() {
		return uEmail;
	}
	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return uId + " " + uName + " " + uEmail + " " + password ;
	}
	
	
}
