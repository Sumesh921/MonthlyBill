package com.mbs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mbs.entities.Bill;
import com.mbs.repository.BillRepository;



@Service
public class BillService {
	
	@Autowired
	private BillRepository billRepository;
	
	public void generateBill(Bill bill) {
		billRepository.save(bill);
	}
	
	

}
