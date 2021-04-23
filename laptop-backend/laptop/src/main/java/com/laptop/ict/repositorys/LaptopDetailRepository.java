package com.laptop.ict.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laptop.ict.models.LaptopDetail;

@Repository
public interface LaptopDetailRepository extends JpaRepository<LaptopDetail, Integer> {

}
