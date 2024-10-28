package com.mbs.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mbs.entities.Sales;
import com.mbs.repository.SalesRepository;

@Service
public class SalesService {
	
	
	@Autowired
	private SalesRepository salesRepository;
	
	public void recordSales(Sales sales) {
		salesRepository.save(sales);
		
		
		
	}
	public List<Sales> getSalesForMonth(Long customerId,LocalDate startDate,LocalDate endDate){
		return salesRepository.findByCustomerIdAndDateBetween(customerId, startDate, endDate);
	}
}
