package com.laptop.ict.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptop.ict.models.Brand;

public interface BrandRepository extends JpaRepository<Brand, Integer> {

}
