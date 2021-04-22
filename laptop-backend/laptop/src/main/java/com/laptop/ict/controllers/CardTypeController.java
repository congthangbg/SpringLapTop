package com.laptop.ict.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.laptop.ict.exceptions.ResourceNotFoundException;
import com.laptop.ict.models.CardType;
import com.laptop.ict.models.ComponentBrand;
import com.laptop.ict.services.CardTypeService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/card")
public class CardTypeController {

	@Autowired 
	CardTypeService cardTypeService;
	
//	@Autowired
//	ComponentBrandService componentBrandService;
	
	@PostMapping("/add")
	public CardType insert(@RequestBody CardType cardType) {
		return cardTypeService.insert(cardType);
	}
	
	@GetMapping("/list")
	public List<CardType> list (){
		List<CardType> list = cardTypeService.findAll();
		return list;
	}
	
	@GetMapping("/get/{id}")
	public Optional<CardType> getid(@PathVariable int id){
		return cardTypeService.getid(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Map<String, Boolean>> delete(@PathVariable int id){
		CardType cardType = cardTypeService.getid(id)
				.orElseThrow(() -> new ResourceNotFoundException("card type not exis : " ));
		cardTypeService.delete(cardType);
		Map<String, Boolean> response = new HashMap<>();
		response.put("delete", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<CardType> update(@PathVariable int id, @RequestBody CardType cardType){
		CardType card = cardTypeService.getid(id)
				.orElseThrow(() -> new ResourceNotFoundException("card not exist"));
		card.setCardDesign(cardType.getCardDesign());
		card.setCardType(cardType.getCardType());
		card.setBrand(cardType.getBrand());
		
		CardType updatecard = cardTypeService.insert(card);
		return ResponseEntity.ok(updatecard);
		
	}
	
}
