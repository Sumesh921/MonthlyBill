package com.mbs;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.mbs.entities.Customer;
import com.mbs.entities.Sales;
import com.mbs.repository.CustomerRepository;
import com.mbs.repository.SalesRepository;

@SpringBootApplication
public class MilkbillingsystemApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(MilkbillingsystemApplication.class, args);
		
		CustomerRepository customerRepository= context.getBean(CustomerRepository.class);
		
		SalesRepository salesRepository= context.getBean(SalesRepository.class);
		
		initializeData(customerRepository,salesRepository);
		
	}

	private static void initializeData(CustomerRepository customerRepository, SalesRepository salesRepository) {
		
		Customer customer1= new Customer();
		customer1.setName("sumesh");
		customer1.setAddress("bangalore");
		customer1.setPhone("7722828239");
		
		Customer customer2=new Customer();
		customer2.setName("Diksha");
		customer2.setAddress("bangalore");
		customer2.setPhone("8888888888");
		
		
		customerRepository.save(customer1);
		customerRepository.save(customer2);
		
		Sales sales1= new Sales();
		sales1.setCustomer(customer1);
		sales1.setDate(LocalDate.now());
		sales1.setCowMilkQty(30);
		sales1.setBuffaloMilkQty(2);
		sales1.setPaneerQty(1.2);
		sales1.setAbsent(false);
		
		Sales sales2= new Sales();
		sales2.setCustomer(customer2);
		sales2.setDate(LocalDate.now());
		sales2.setCowMilkQty(12);
		sales2.setAbsent(false);
		
		salesRepository.save(sales1);
		salesRepository.save(sales2);
		
		System.out.println("Initial customer and sales data have been added");
		
	}

}
