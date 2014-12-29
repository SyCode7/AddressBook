package de.addrBook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect {
	
		   // JDBC driver name and database URL
		   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
		   static final String DB_URL = "jdbc:mysql://localhost:3306/devopsone";

		   //  Database credentials
		   static final String USER = "root";
		   static final String PASS = "@timechance7";
		   public static Connection conn = null;
		   public static Statement stmt = null;
		   
		   public static void main(String[] args) {
			   createConnection();
			   createPersonTable();
			   createAddressTable();
			   DBConnectionclose();
		   }
			  
		   
		   public static Connection createConnection() {
	    	  
				   try{
					   //STEP 2: Register JDBC driver
					   Class.forName("com.mysql.jdbc.Driver");
					   
					   //STEP 3: Open a connection
					   System.out.println("Connecting to a selected database...");
					   conn = DriverManager.getConnection(DB_URL, USER, PASS);
					   System.out.println("Connected database successfully...");
					   
				   }catch(SQLException se){
					      //Handle errors for JDBC
					      se.printStackTrace();
					   }catch(Exception e){
					      //Handle errors for Class.forName
					      e.printStackTrace();
					   }
				return conn;
			   }
		   
		   public static void createPersonTable() {
			
			  System.out.println("Creating Person table .....");
		      
		      try {
		        stmt = conn.createStatement();
			        
				String sql = "CREATE TABLE Person " +
				               "(id INTEGER not NULL, " +
				               " firstname VARCHAR(255), " + 
				               " lastname VARCHAR(255), " + 
				               " age INTEGER, " + 
				               " sex VARCHAR(255), " + 
				               " phonenumber INTEGER , " + 
				               " PRIMARY KEY ( id ))"; 

				  stmt.executeUpdate(sql);
				  System.out.println("Created Person table .....");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		   
		}

		private static void createAddressTable() {
			//STEP 4: Execute a query
		      System.out.println("Creating Address.....");
		      try {
				stmt = conn.createStatement();
				  
				  String sql = "CREATE TABLE Address " +
				               "(id INTEGER not NULL, " +
				               " address VARCHAR(255), " + 
				               " street VARCHAR(255), " + 
				               " state VARCHAR(255), " + 
				               " city VARCHAR(255), " +
				               " PRIMARY KEY ( id ))"; 

				  stmt.executeUpdate(sql);
				  System.out.println("Created Address table .....");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   
		      try{
		         if(stmt!=null)
		            conn.close();
		      }catch(SQLException se){
		      }// do nothing
		    
			
		}
		
		public static void DBConnectionclose() {
		
			try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
			System.out.println("Goodbye!");
		   }//end try

}     
		
	

	
	
	 
