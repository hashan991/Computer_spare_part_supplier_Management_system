package com.xadmin.supplier_product.bean;

public class User {
	private int id;
	private String name;
	private String email;
	private String country;
	
	
	
	
	
	public User(String name, String email, String country) {
		super();
		this.name = name;
		this.email = email;
		this.country = country;
	}
	public User(int id, String name, String email, String country) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.country = country;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getCountry() {
		return country;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
