package com.gl.RechargeApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.RechargeApp.bean.Bill;
import com.gl.RechargeApp.bean.Offer;
import com.gl.RechargeApp.repository.BillRepository;
import com.gl.RechargeApp.repository.OfferRepository;


@Service
public class RechargeService {
	
	@Autowired
	private OfferRepository repo;
	@Autowired
	private BillRepository repository;
	
	public void save(Offer offer)
	{
		repo.save(offer);
	}
	
	public void saveBill(Bill bill)
	{
		repository.save(bill);
	}
	public List<Offer> findAll()
	{
		return repo.findAll();
	}
	public Offer findById(Long id)
	{
		return repo.getById(id);
	}
	

	public Long generateBillId()
	{
		Long val=repository.findMaxBillId();
		if(val==null)
		{
			val=100001L;
		}
		else
		{
			val=val+1;
		}
		return val;
	}

}
