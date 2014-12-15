package de.addrBook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookItems {
	

	public static void main(String[] args) {
		
		ArrayList<AddressBookItem> addressList = new ArrayList<AddressBookItem> ();
		Address addr = new Address ("grob.st", "street A", "123","state1");
		Person per = new Person("ade", "mike", "male", 123462 , 23, 1);
		
		AddressBookItem item = new AddressBookItem(per,addr);
		
		addressList.add(item);
		
		Scanner input = new Scanner (System.in);
		System.out.println("enter the lastname to search for or q to quit: ");
		String searchTerm = input.next().trim();
		
		if (searchTerm.equals("q") ==  false) {
			
			boolean found = false;
			
			for (AddressBookItem a : addressList) {
				if (a.getPerson().getLastname().equals(searchTerm)) {
					
					System.out.println("yeah got it, " + searchTerm + "'s contact information is :");
					System.out.println("First name :" + a.getPerson().getFirstname());
					System.out.println("Last name : " + a.getPerson().getLastname());
					System.out.println("Sex:" + a.getPerson().getSex());
					System.out.println("Age :" + a.getPerson().getPhonenumber());
					System.out.println("Address :" + addr.getAddress());
					System.out.println("State : " + addr.getState());
					System.out.println("Street: " + addr.getStreet());
					System.out.println("Zipcode: " + addr.getZipcode());
					
					found = true;
				
				}
				
			}
			
			if (found == false) {
				System.out.println("Sorry, the person your are looking for is not found !");
			}
				
			}
			
		}
	}
	
