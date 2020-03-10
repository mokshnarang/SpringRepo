package com.niit.ecomm;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

class DeliveryVendor extends Userc{

	static int vendorid=199;
	public void set_details(){
		Scanner sc = new Scanner(System.in);
		//ph_no=sc.nextInt();
		//email=sc.next();
		pincode=sc.nextInt();
		address=sc.next();
		firstName=sc.next();
		city=sc.next(); 
		
	   //S static int vendorid=199;
		
		try {
			Connection con = DataConnect.getMyConnection();
		    PreparedStatement ps = con.prepareStatement("insert into delivery_vendor(vendor_id,vendor_name) values"
		    		+ "(?,?)");
		    ps.setInt(1,vendorid);
		    ps.setString(2, this.firstName);
		   
		    int i = ps.executeUpdate();
		    
		    ps=con.prepareStatement("insert into address_cust_vend_delivery values"
		    		+ "(?,?,?,?)");
		    
		    ps.setInt(1,vendorid);
		    ps.setString(2, this.address);
		    ps.setString(3,this.city);
		    ps.setInt(4, this.pincode);
		    int i2 = ps.executeUpdate();
		    
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
	
	public void get_details(){
		
	}
	
	
	public void status_track(){
		
	}
	
	public void generate_report(){
		
	}
}
