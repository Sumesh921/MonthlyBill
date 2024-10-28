package com.mbs.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class Sales {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	
	@ManyToOne
	@JoinColumn(name = "cutomer_id")
	private Customer customer;
	
	
	private LocalDate date;
	private double cowMilkQty;
	private double buffaloMilkQty;
	private double paneerQty;
	private boolean isAbsent;
	public Sales() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sales(long id, Customer customer, LocalDate date, double cowMilkQty, double buffaloMilkQty, double paneerQty,
			boolean isAbsent) {
		super();
		this.id = id;
		this.customer = customer;
		this.date = date;
		this.cowMilkQty = cowMilkQty;
		this.buffaloMilkQty = buffaloMilkQty;
		this.paneerQty = paneerQty;
		this.isAbsent = isAbsent;
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
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public double getCowMilkQty() {
		return cowMilkQty;
	}
	public void setCowMilkQty(double cowMilkQty) {
		this.cowMilkQty = cowMilkQty;
	}
	public double getBuffaloMilkQty() {
		return buffaloMilkQty;
	}
	public void setBuffaloMilkQty(double buffaloMilkQty) {
		this.buffaloMilkQty = buffaloMilkQty;
	}
	public double getPaneerQty() {
		return paneerQty;
	}
	public void setPaneerQty(double paneerQty) {
		this.paneerQty = paneerQty;
	}
	public boolean isAbsent() {
		return isAbsent;
	}
	public void setAbsent(boolean isAbsent) {
		this.isAbsent = isAbsent;
	}
	

}
