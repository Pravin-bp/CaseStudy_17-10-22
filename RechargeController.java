package com.gl.RechargeApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gl.RechargeApp.bean.Bill;
import com.gl.RechargeApp.bean.Offer;
import com.gl.RechargeApp.service.RechargeService;


public class RechargeController {
	@Autowired 
	private RechargeService service;
	
	@GetMapping(value="/welcome")
	 public ModelAndView showWelcomePage()
	{
		ModelAndView mv=new ModelAndView("welcomePage");
		List<Offer> list=service.findAll();
	  	mv.addObject("List",list);
		return mv;
	}
	@PostMapping("/welcome")
	 public ModelAndView showPage(@RequestParam("mobile") Integer mobile,@RequestParam("offerId") Long idd)
	{
	    Bill bill=new Bill();
	    long id=service.generateBillId();
	    bill.setMobileNumber(mobile);
	    bill.setTransactionId(id);
	    service.saveBill(bill);
	    Offer offer=service.findById(idd);
	    bill.setOfferId(id);
	    ModelAndView mv=new ModelAndView("ResultPage");
		mv.addObject("Offer",offer);
		mv.addObject("bill",bill);
		return mv;
	}
	
}
