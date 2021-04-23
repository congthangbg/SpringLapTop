package com.laptop.ict.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laptop.ict.models.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer> {

}
