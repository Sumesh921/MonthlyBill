package com.mbs.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class Bill {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;
	
	private String billingMonth;
	private double totalAmount;
	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bill(long id, Customer customer, String billingMonth, double totalAmount) {
		super();
		this.id = id;
		this.customer = customer;
		this.billingMonth = billingMonth;
		this.totalAmount = totalAmount;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getBillingMonth() {
		return billingMonth;
	}
	public void setBillingMonth(String billingMonth) {
		this.billingMonth = billingMonth;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	

}
