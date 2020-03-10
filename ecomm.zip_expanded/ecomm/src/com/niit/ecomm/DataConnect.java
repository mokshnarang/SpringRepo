package com.niit.ecomm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataConnect{
	
	
	
	public static Connection getMyConnection() throws ClassNotFoundException, SQLException{
		
		//Connection con;
		//try{
			//registring the jdbc driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//opening a conncection
			//Connection con=DriverManager.getConnection("jdbc:mysql://192.168.252.139:3306/temp_tlc","root","root");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tlc","root","9971");
			
			return con;
		//}
		//catch(Exception e)
		//{
		//	System.out.println(e);
		//}
	
		//return con;
	}
		
}

