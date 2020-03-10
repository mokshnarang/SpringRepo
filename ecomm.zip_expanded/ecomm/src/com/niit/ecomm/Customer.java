package com.niit.ecomm;

import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.*;

class Customer extends Userc{
	
	//static Scanner sc = new Scanner(System.in);
	
	String gphn;
	static String phoneNo;
	String password;
	
	public void set_details(){
		
		System.out.println("enter ur details");
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("enter phone no");
		phoneNo=sc1.next();
		gphn=phoneNo;
		System.out.println("enter email");
		email=sc1.next();
		System.out.println("enter ur first name");
		firstName=sc1.next();
		System.out.println("eneter ur last name");
		lastName=sc1.next();
		System.out.println("enter address");
		address=sc1.next();
		System.out.println("enter ur password");
		password=sc1.next();
		
		try{
			Connection con=DataConnect.getMyConnection();
			
			 PreparedStatement ps = con.prepareStatement("insert into customer values"
			    		+ "(?,?,?,?,?)");
			    ps.setString(1, this.phoneNo);
			    ps.setString(2, this.email);
			    ps.setString(3, this.firstName);
			    ps.setString(4, this.lastName);
			    ps.setString(5, this.password);
		}
		catch (Exception e) {
		    e.printStackTrace();
		}
		
	}
	public void get_details(){
		
		try {
			Connection con = DataConnect.getMyConnection();
		    PreparedStatement ps = con.prepareStatement("select * from customer where phone_no= ?");
		    
		    ps.setString(1,"9971285995");
		    	
		    ResultSet rs = ps.executeQuery();
		    while(rs.next()){
		         String name1=rs.getString(1)+ " : " + rs.getString(2);
		         System.out.println(name1);
		         }
		    
		    con.close();
		} catch (Exception e) {
		    e.printStackTrace();
		}
		
	}
	
	public void loginCustomer(){
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("eneter ur user id");
		String userid=sc1.next();
		System.out.println("enter ur password");
		String passwordlogin=sc1.next();
	
		
		try {
			Connection con = DataConnect.getMyConnection();
		    PreparedStatement ps = con.prepareStatement("select phone_no from customer where phone_no= ? && password=?");
		    
		    ps.setString(1,userid);
		    ps.setString(2, passwordlogin);
		    
		    //System.out.println("ur now logged in");
		   // ps.executeQuery();
		    ResultSet rs = ps.executeQuery();
		    //while(rs.next()){
		      //   String name1=rs.getString(1)+ " : " + rs.getString(2);
		        // System.out.println(name1);
		         //}
		    
		    if(rs.next()==false)
		    	System.out.println("wrong password");
		    
		    else
		    	System.out.println("U are now logged in");
		    
		    con.close();
		} catch (Exception e) {
		    e.printStackTrace();
		    System.out.println("ur id or passsword is wrong");
		}
	}
	
	
	public void add_item(){
		
	}
	
	public void remove_item(){
		
	}
	
	public void order_payment(){
		
		try{
			Connection con=DataConnect.getMyConnection();
			
			 PreparedStatement ps = con.prepareStatement("insert into payment values"
			    		+ "(?,?,?,?)");
			    ps.setString(1, Payment.transaction_id);
			    ps.setString(2, this.phoneNo);
			    ps.setInt(3, DeliveryVendor.vendorid);
			   // ps.setString(4, this.lastName);
			   // ps.setString(5, this.password);
		}
		catch (Exception e) {
		    e.printStackTrace();
		}
	}
	
	public void place_order(){
		
		try{
			Connection con=DataConnect.getMyConnection();
			PreparedStatement ps;
//			ps=con.prepareStatement("select price from product where product_id=?");
//			ps.setInt(1, Product.product_id);
//			ResultSet rs=ps.executeQuery();
//			
//			String pk=rs.toString();
		    //int productprice=Integer.parseInt(pk);  
			
			
		
			
			  ps = con.prepareStatement("insert into order1"
					  + "(order_id,product_id,phone_no,transaction_id,order_amt) values"
			    		+ "(?,?,?,?,?)");
			    ps.setInt(1, Order.order_id);
			    ps.setString(2, Product.product_id);
			    ps.setString(3, Customer.phoneNo);
			    ps.setString(4, Payment.transaction_id);
			    ps.setInt(5, 1000);
			    ps.executeUpdate();
			    
		}
		catch (Exception e) {
		    e.printStackTrace();
		}
	}
	
	public void cancel_order(){
		
		try{
			Connection con=DataConnect.getMyConnection();
			PreparedStatement ps;
			
		System.out.println("enter ur orderid which u want to cancel");
		Scanner sc1 = new Scanner(System.in);
		String cancel=sc1.next();
		String cancelorderVal="1";
		
			
			  ps = con.prepareStatement("update order1 SET cancel_order=" + "(?)" 
					  + "where order_id="
			    		+ "(?)");
			    ps.setString(1,cancelorderVal);
			    ps.setString(2,cancel);
			    ps.executeUpdate();
			    
			    System.out.println("ur order has been cancelled");
			    
		}
		catch (Exception e) {
		    e.printStackTrace();
		}
		
	}
	
	public void status_track(){
		System.out.println("enter order id for which u want to track the status");
		Scanner sc1 = new Scanner(System.in);
		String status=sc1.next();
		
		try{
			Connection con=DataConnect.getMyConnection();
			PreparedStatement ps;
			ps=con.prepareStatement("select status from delivery_details where order_id=?");
			ps.setString(1, status);
			ResultSet rs=ps.executeQuery();
			
			String pk=rs.toString();
			
			if(pk=="1"){
				System.out.println("ur order is delivered");
			}
			
			else
				System.out.println("ur order is on the way");
		    //int productprice=Integer.parseInt(pk);  
			
			  
		}
		catch (Exception e) {
		    e.printStackTrace();
		}
		
		
	}
	
}
