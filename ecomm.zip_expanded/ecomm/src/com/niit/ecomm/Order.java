package com.niit.ecomm;

class Order {

	static int order_id=1;
    String order_datetime;
    static int order_qty;
    int order_amt;
    
    
    /*
    public void order_details(){
    	System.out.println("ur order details are"+ order_id +order_datetime +order_qty +order_amt);
    }*/
    
    public static int getOrder_id() {
		return order_id;
	}


	public static void setOrder_id(int order_id) {
		Order.order_id = order_id;
	}


	public String getOrder_datetime() {
		return order_datetime;
	}


	public void setOrder_datetime(String order_datetime) {
		this.order_datetime = order_datetime;
	}


	public static int getOrder_qty() {
		return order_qty;
	}


	public static void setOrder_qty(int order_qty) {
		Order.order_qty = order_qty;
	}


	public int getOrder_amt() {
		return order_amt;
	}


	public void setOrder_amt(int order_amt) {
		this.order_amt = order_amt;
	}


	public void cancel_order(){
    	
    }
	
}
