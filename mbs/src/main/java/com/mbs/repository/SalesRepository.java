package com.mbs.repository;
import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mbs.entities.Sales;

public interface SalesRepository extends JpaRepository<Sales, Long> {
	List<Sales> findByCustomerIdAndDateBetween(Long customerId,LocalDate startDate,LocalDate endDate);

}
