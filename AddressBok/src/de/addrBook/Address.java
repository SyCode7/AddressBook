package de.addrBook;

public class Address {
	
	public String address;
	public String street;
	public String zipcode;
	public String state;
	
	
	public Address(String address, String street, String zipcode, String state) {
		super();
		this.address = address;
		this.street = street;
		this.zipcode = zipcode;
		this.state = state;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getZipcode() {
		return zipcode;
	}


	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}

}
