package com.laptop.ict.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptop.ict.models.Laptop;

public interface LaptopRepository extends JpaRepository<Laptop, Integer> {

}
