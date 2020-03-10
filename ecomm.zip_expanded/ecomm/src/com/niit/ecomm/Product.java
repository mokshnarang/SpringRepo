package com.niit.ecomm;

import java.util.Random;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.Statement;


class Product {

	static String product_id="123";    //pahle home wale p int tha
	String product_name;
	int price;
	String product_desc;
	/*public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getPrize() {
		return prize;
	}
	public void setPrize(int prize) {
		this.prize = prize;
	}
	public String getProduct_desc() {
		return product_desc;
	}
	public void setProduct_desc(String product_desc) {
		this.product_desc = product_desc;
	}
	public int getProduct_id() {
		return product_id;
	}*/
	
	
	public void setDetails(){
		Scanner sc = new Scanner(System.in);
		product_id=sc.next();
		product_name=sc.next();
		price=sc.nextInt();
		product_desc=sc.next();
		
		try {
			Connection con = DataConnect.getMyConnection();
		    PreparedStatement ps = con.prepareStatement("insert into product values"
		    		+ "(?,?,?,?)");
		    ps.setString(1,this.product_id);
		    ps.setString(2, this.product_name);
		    ps.setInt(3, this.price);
		    ps.setString(4, this.product_desc);
		   
		    int i = ps.executeUpdate();
		    if (i != 0) {
		        System.out.println("Inserted");
		    } else {
		        System.out.println("not Inserted");
		    }
		    con.close();
		} catch (Exception e) {
		    e.printStackTrace();
		}
		
	}
	
	public void show_details(){
		//System.out.println(+product_id +product_name +price +product_desc );
	}
}
