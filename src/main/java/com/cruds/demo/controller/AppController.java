package com.cruds.demo.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cruds.demo.db.DBConnectionManager;
import com.cruds.demo.service.Service;

@Controller
public class AppController {
	
	
	@RequestMapping("/hello")
	public String showHelloPage()
	{
		return "hello";
	}
	
	/* @RequestMapping(value="/hello", method=RequestMethod.POST)
	public ModelAndView processHello(@RequestParam("userName") String name)
	{
		System.out.println(name);
		return new ModelAndView("hello", "USERNAME", name);
	} */
	
	
	@RequestMapping(value="/hello", method=RequestMethod.POST)
	public String processHello(@RequestParam("FirstName") String Firstname,@RequestParam("LastName") String Lastname, Model model)
	{
		//System.out.println(name);
		model.addAttribute("FIRSTNAME", Firstname);
		model.addAttribute("LASTNAME", Lastname);
		String F1 = Firstname;
		String F2 = Lastname;
		
		Service ser = new Service();
		ser.create(F1,F2);
		
		
		return "welcome";
	}	
	
}
