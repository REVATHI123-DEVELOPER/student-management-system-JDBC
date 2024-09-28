package com.connectionjdbc;

import java.sql.*;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class connectionjdbc {
// I make the method as static that's why need to make the object also static
	static Connection con;
//	when we use static keyword there is no need to call we can use static keyword directly..
	public static Connection createC()
	{
		
		
		try {
			
//			step1: load the driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			for creating an connection we need to use this fields..
			String user = "root";
			String password = "Revathi006@";
			String url = "jdbc:mysql://localhost:3306/student_management_system_application";
			
			
//	step 2: create the connection using DriverManager
			con = DriverManager.getConnection(url,user,password);
			
			
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		after storing the details in an object we can return the object data also by using return
		return con;
	
	}



}
