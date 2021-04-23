package com.laptop.ict.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laptop.ict.models.ComponentBrand;

@Repository
public interface ComponentBrandRepository extends JpaRepository<ComponentBrand, Integer> {

}
