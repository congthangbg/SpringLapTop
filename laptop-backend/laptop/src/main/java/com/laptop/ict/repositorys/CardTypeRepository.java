package com.laptop.ict.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laptop.ict.models.CardType;

@Repository
public interface CardTypeRepository extends JpaRepository<CardType, Integer> {

}
