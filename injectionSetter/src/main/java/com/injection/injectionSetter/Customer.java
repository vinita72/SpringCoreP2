package com.injection.injectionSetter;


public class Customer {
	private int id;  
	private String name;  
	private Address address;  
	  
	//setter Injection
	 
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public Address getAddress() {
//		return address;
//	}
//
//	public void setAddress(Address address) {
//		this.address = address;
//	}
	
	// constructure Injection
	
	
	
	 

	public Customer(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	void display() {
		 System.out.println("Hello");
		System.out.println(id+" "+name);  
	    System.out.println(address);  		
	}
	
	}  


