package com.laptop.ict.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laptop.ict.models.ComponentSupplier;

@Repository
public interface ComponentSupplierRepository extends JpaRepository<ComponentSupplier, Integer> {

}
