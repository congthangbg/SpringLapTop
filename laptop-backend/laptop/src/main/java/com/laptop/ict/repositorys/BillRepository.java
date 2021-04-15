package com.laptop.ict.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptop.ict.models.Bills;

public interface BillRepository extends JpaRepository<Bills, Integer> {

}
