package com.gl.RechargeApp.controller;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.gl.RechargeApp.service.UserService;
@RestController
public class LoginController extends RechargeController{
	
	@Autowired
	private UserService service;
	

	
	@GetMapping(value="/loginpage")
	 public ModelAndView showLoginPage() {
		 return new ModelAndView("loginPage");
	 }
	
	@GetMapping(value="/loginerror")
	 public ModelAndView showErrorPage() {
		 return new ModelAndView("errorPage");
	 }

}




