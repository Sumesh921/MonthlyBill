package com.mbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mbs.entities.Bill;

public interface BillRepository extends JpaRepository<Bill, Long>{

}
