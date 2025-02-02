package com.mbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mbs.entities.Bill;
import com.mbs.service.BillService;

@RestController
@RequestMapping("/bills")
@CrossOrigin
public class BillController {
	
	
	@Autowired
	private BillService billService;
	
	@PostMapping
	public void generateBill(@RequestBody Bill bill) {
		billService.generateBill(bill);
		
		
	}

}
