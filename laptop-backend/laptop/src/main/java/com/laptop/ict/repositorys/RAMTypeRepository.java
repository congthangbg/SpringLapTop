package com.laptop.ict.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laptop.ict.models.RAMType;

@Repository
public interface RAMTypeRepository extends JpaRepository<RAMType, Integer> {

}
