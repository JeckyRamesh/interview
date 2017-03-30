package com.adp.interview;
import java.sql.*; 

public class CompanyName {
	
	   
	public static void main(String args[]){  
		  
		try{  
		Class.forName("com.mysql.jdbc.Driver");	 
		
		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind?user=interview&password=interview"	 );

		 
		Statement stmt=connect.createStatement();  
		ResultSet rs=stmt.executeQuery("select CompanyName from Customers");  
		while(rs.next())  
		System.out.println(rs.getString(1));  
		connect.close();  
		}catch(Exception e){ System.out.println(e);}  
		}  
}

