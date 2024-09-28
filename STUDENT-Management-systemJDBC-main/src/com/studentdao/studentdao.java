package com.studentdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.connectionjdbc.connectionjdbc;
import com.entity.student;

public class studentdao {
//for firing the queries need to give the student data
//	student data is stored in studnet.java st->object
	public static boolean insertStudent(student st) 
	{
		boolean  f=false;
		try
		{
//		jdbc code
		Connection con = connectionjdbc.createC();
		String q ="Insert into students(sid, sname, sphone, scity) values(?,?,?,?)";
		PreparedStatement p = con.prepareStatement(q);
		
		p.setInt(1, st.getStudentId());
		p.setString(2, st.getStudentName());
		p.setString(3, st.getStudentPhone());
		p.setString(4, st.getStudentCity());
//		inserting the data into sql by using the object that has been created in start.java
		
//		execute
		p.executeUpdate();
		f=true;
		
		
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return f;
		
		
		
	}
	
	public static boolean deletestudent(int userId) {
		boolean  f=false;
		try
		{
//		jdbc code
		Connection con = connectionjdbc.createC();
		String q ="delete from students where sid=?";
		PreparedStatement p = con.prepareStatement(q);
		
//		basis of id we are going to delte the data
		p.setInt(1, userId);
		
		
//		execute
		p.executeUpdate();
		f=true;
		
		
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return f;
		
		
	}
	public static void showallstudent()
	{
		try
		{
//		jdbc code
		Connection con = connectionjdbc.createC();
		String q ="select * from students";
		
		Statement s = con.createStatement(0, 0);
		
		ResultSet set = s.executeQuery(q);
		
		while(set.next())
		{
			int id = set.getInt(1);
			String name = set.getString(2);
			String phone = set.getString(3);
			String city = set.getString(4);
			
			System.out.println("id: "+id);
			System.out.println("name: "+name);
			System.out.println("phone no: "+phone);
			System.out.println("city: "+city);
			
			
			System.out.println("_____________________________________________");
			
			
			
		}
		
		
//		set the values
		
		
		
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		

		
	}
	public static boolean updateStudent(student st,int userId2) {
		boolean  f=false;
		try
		{
//		jdbc code
		Connection con = connectionjdbc.createC();
		String q ="update students set sid=?,sname=? ,sphone=? ,scity=? where sid=?";
		PreparedStatement p = con.prepareStatement(q);
		
		p.setInt(1, st.getStudentId());
		p.setString(2, st.getStudentName());
		p.setString(3, st.getStudentPhone());
		p.setString(4, st.getStudentCity());
		p.setInt(5, userId2);
//		inserting the data into sql by using the object that has been created in start.java
		
//		execute
		p.executeUpdate();
		f=true;
		
		
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return f;
		
		
		
		
		
	}

	public static void searchstudent(int Id3) {
		try
		{
//		jdbc code
		Connection con = connectionjdbc.createC();
		String q ="select * from students where sid=Id3";
		
		PreparedStatement p = con.prepareStatement(q);
		p.setInt(1, Id3);
		
		
		ResultSet set = p.executeQuery(q);
		
		
		while(set.next())
		{
			int id = set.getInt(1);
			String name = set.getString(2);
			String phone = set.getString(3);
			String city = set.getString(4);
			
			System.out.println("id: "+id);
			System.out.println("name: "+name);
			System.out.println("phone no: "+phone);
			System.out.println("city: "+city);
			
			
			System.out.println("_____________________________________________");
			
			
			
		}
		
		
//		set the values
		
		
		
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
				
		


		
	}



}
