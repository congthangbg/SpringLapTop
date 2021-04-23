package com.laptop.ict.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.laptop.ict.models.CardType;
import com.laptop.ict.repositorys.CardTypeRepository;

@Service
public class CardTypeServiceImpl implements CardTypeService {

	@Autowired
	private CardTypeRepository carTypeRepository;
	
	@Override
	public CardType insert(CardType cardType) {
		
		return carTypeRepository.save(cardType);
	}

	@Override
	public List<CardType> findAll() {
		// TODO Auto-generated method stub
		List<CardType> list = carTypeRepository.findAll();
		return list;
	}

	@Override
	public void delete(CardType cardType) {
		// TODO Auto-generated method stub
		carTypeRepository.delete(cardType);
	}

	@Override
	public Optional<CardType> getid(int id) {
		// TODO Auto-generated method stub
		return carTypeRepository.findById(id);
	}
	

}
