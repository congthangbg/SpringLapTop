package com.laptop.ict.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptop.ict.models.Products;

public interface ProductRepository extends JpaRepository<Products, Integer> {

}
