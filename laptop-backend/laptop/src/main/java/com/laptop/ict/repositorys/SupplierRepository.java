package com.laptop.ict.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptop.ict.models.Suppliers;

public interface SupplierRepository extends JpaRepository<Suppliers, Integer> {

}
