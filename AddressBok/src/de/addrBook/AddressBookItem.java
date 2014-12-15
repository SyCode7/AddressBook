package de.addrBook;

public class AddressBookItem {
	
	private Person person;
	private Address address;

	public AddressBookItem(Person person) {
		this.person = person;
	}
	
	public AddressBookItem(Person person, Address A) {
		this.person = person;
		address=A;
	}
	
	public Person getPerson() {
		return person;
		
	}
	
	public void setPerson(Person person) {
		this.person = person;
	}

	public Address getAddress() {
		return address;
	}

	
}
