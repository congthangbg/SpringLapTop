package com.laptop.ict.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptop.ict.models.Brands;

public interface BrandRepository extends JpaRepository<Brands, Integer> {

}
