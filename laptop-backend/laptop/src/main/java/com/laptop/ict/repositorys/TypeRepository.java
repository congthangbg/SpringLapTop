package com.laptop.ict.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptop.ict.models.Types;

public interface TypeRepository extends JpaRepository<Types, Integer> {

}
