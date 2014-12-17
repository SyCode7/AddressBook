package de.addrBook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDB {
	
	private static String dbURL = "jdbc:derby://localhost:1527/myDB.MYADDRESBOOKAPP;create=true;user=root;password=@timechance7";
	private static String personTable =  "person";
	private static String addressTable =  "address";
	private static Connection conn =  null;
	private static Statement stmt =  null;
	
	public static void main(String[] args) {
		createConnection();
		insertPerson(1, "Adeyemi", "Yemisi", "Female", 2341232, 32);
		insertAddress("No 23", "Potsdam", "Liverpool", "Baster");
//		searchInfo();
		
		
	}

	private static void createConnection() {
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
			conn = DriverManager.getConnection(dbURL);
			if (conn!= null) {
				System.out.println("connected to database !");
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
			
	}
	private static void insertPerson(int id, String firstname, String lastname, String sex,
			 int phonenumber, int age ) {
		
			 try {
				stmt =conn.createStatement();
				stmt.execute("insert into " + personTable + "values (" + id + "," + firstname + "," + lastname + "," + sex + "," + phonenumber + "," + age + ")");
			    stmt.close();
			 } catch (SQLException ex) {
				ex.printStackTrace();
			}
			 
	}
	private static void insertAddress(String address, String street, String zipcode, String state) {
		try {
			stmt = conn.createStatement();
			stmt.execute("insert into" + addressTable + "values (" + address + "," + street + "," + state + "," + zipcode + " ) ");
			stmt.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}



//	private static void searchInfo() {
//		
//	}
	
	private static void Shutdown() {
		try {
			if (stmt !=null) {
				stmt.close();
			}
			if (conn != null) {
				DriverManager.getConnection(dbURL + ";shutdown=true");
				conn.close();
			}
	
		} catch (SQLException ex) {
			
		}
		
	}
}
