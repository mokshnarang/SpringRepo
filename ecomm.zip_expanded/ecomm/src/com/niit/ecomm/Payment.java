package com.niit.ecomm;

import java.util.Scanner;

class Payment {

	static String transaction_id="122";    //pahle home wale p int tha holi p
	String payment_mode;
	
	public void transaction(){
		Scanner sc = new Scanner(System.in);
		transaction_id=sc.next();
		payment_mode=sc.next();
	}
	
	public void transaction_details(){
		System.out.println(+Customer.ph_no +Order.order_id +transaction_id +payment_mode);
	}
}
