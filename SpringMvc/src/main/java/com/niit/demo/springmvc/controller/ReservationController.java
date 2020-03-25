package com.niit.demo.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.demo.springmvc.model.Reservation;

@Controller
public class ReservationController {

	@RequestMapping("/bookingForm")
	 public String bookingForm(ModelMap theModel)
	 {
		 //System.out.println("in controller ");
	  Reservation res= new Reservation();
	  theModel.addAttribute("reservation",res);
	  return "reservationPage"; //it has a reservation object
	  
	 }
	
	@RequestMapping("/submitForm")
	public String submitForm(@ModelAttribute("reservation") Reservation res)
	{
		return "confirmationForm";
	}
}
