package com.laptop.ict.services;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.laptop.ict.models.CardType;

public interface CardTypeService {
	CardType insert(CardType cardType);
	
	List<CardType> findAll();
	
	void delete(CardType cardType);
	
	Optional<CardType> getid(int id);
	
}
