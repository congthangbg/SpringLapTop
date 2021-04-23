package com.laptop.ict.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laptop.ict.models.Type;

@Repository
public interface TypeRepository extends JpaRepository<Type, Integer> {

}
