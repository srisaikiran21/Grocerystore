package com.store.beans;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



public class User {
	private int userId;
	private String userName;
	private LocalDate registrationDate;
	private UserType usertype;
	private List<Product> product =new ArrayList<Product>();
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public LocalDate getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}
	public UserType getUsertype() {
		return usertype;
	}
	public void setUsertype(UserType usertype) {
		this.usertype = usertype;
	}
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", registrationDate=" + registrationDate + "]";
	}
	
}
