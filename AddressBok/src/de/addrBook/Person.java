package de.addrBook;

public class Person {
	
	public String firstname;
	public String lastname;
	public int age;
	public String sex;
	public int phonenumber;
	public int id;
	
	
	public Person(String firstname, String lastname, String sex,
			 int phonenumber, int age, int id) {
		super();
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.sex = sex;
		this.phonenumber = phonenumber;
		this.id = id;
		
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public int getPhonenumber() {
		return phonenumber;
	}


	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
	
	
	

}
