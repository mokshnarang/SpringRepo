package com.niit.demo.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.demo.springmvc.model.Employee;

@Controller
public class EmployeeController {
 
 @RequestMapping("/employeeForm")
 public String showFormForAdd(ModelMap model)
 {
	 System.out.println("in controller ");
  Employee theEmp= new Employee();
  model.addAttribute("emp",theEmp);
  return "registerEmployee";
  
 }
 
 @RequestMapping(value="/addEmployee",method=RequestMethod.POST)
 public String submit(@ModelAttribute("emp")Employee employee,ModelMap model) {
  model.addAttribute("name",employee.getName());
  model.addAttribute("contact",employee.getContactNumber());
  model.addAttribute("id",employee.getId());
  return "viewEmployee";
 }
 
}