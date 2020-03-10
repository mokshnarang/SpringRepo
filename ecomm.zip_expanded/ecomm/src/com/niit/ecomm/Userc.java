package com.niit.ecomm;

public abstract class Userc {

	public static int ph_no;
	protected String email;
	protected String firstName;
	protected String lastName;
	protected String address;
	protected String city;
	
	protected int pincode;
    
    abstract void get_details();
    abstract void status_track();
    abstract void set_details();
}
