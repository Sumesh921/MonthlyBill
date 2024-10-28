package com.mbs.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mbs.entities.Sales;
import com.mbs.service.SalesService;

@RestController
@RequestMapping("/sales")
@CrossOrigin
public class SalesController {
	
	
	@Autowired
	private SalesService salesService;
	
	
	
	@PostMapping
	public void recordSales(@RequestBody Sales sales) {
		salesService.recordSales(sales);
	}
	
	
	@GetMapping
	public List<Sales> getSalesForMonth(@RequestParam Long customerId, @RequestParam String startDate, @RequestParam String endDate){
		return salesService.getSalesForMonth(customerId, LocalDate.parse(startDate), LocalDate.parse(endDate));
		
	}
	
	

}
