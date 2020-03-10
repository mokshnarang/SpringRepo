package com.niit.ecomm;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.Statement;

public class MainClassEcomm {

	public static void main(String[] args) {
		
		/*
		try {
			Connection con=DataConnect.getMyConnection();
			
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from customer");
			
			
			//extract data from resultset
			while(rs.next())
				System.out.println(rs.getInt(1)+ " "+ rs.getString(2));
				con.close();
			 
			 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		//Product p1=new Product();
		//p1.setDetails();
		
		//DeliveryVendor d1=new DeliveryVendor();
		//d1.set_details();
		
		//Customer cust=new Customer();
		//cust.loginCustomer();		
		
		System.out.println("Welcome what ur looking for");
		
		System.out.println("register urself");
		System.out.println("login");
		System.out.println("order");
		
		int sw;
		
		Scanner sc1 = new Scanner(System.in);
		sw=sc1.nextInt();
		
		Customer cust=new Customer();
		
		 
		
		switch(sw){
		
		case 1: System.out.println("register urself");
		        //Customer cust=new Customer();
		        cust.set_details();
		
		break;
		
		case 2: System.out.println("login");
		        cust.loginCustomer();
		break;
		
		case 3: //do u want to place the order or check the existing order or cancel the order
		
		        System.out.println("What u want to do");
		        System.out.println("1) for place new order");
		        System.out.println("2) for check status for existing order");
		        System.out.println("3) for cancel ur order");
		        
		        Scanner sc = new Scanner(System.in);
				int sk=sc.nextInt();
				
				if(sk==1){
					cust.order_payment();
					cust.place_order();
				}
				else if(sk==1){
					cust.status_track();
				}
				else
					cust.cancel_order();
		        
		break;
		 
		}


	}

}
