package com.laptop.ict.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.ResourceAccessException;

import com.laptop.ict.models.Laptop;
import com.laptop.ict.repositorys.LaptopRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/")
public class LaptopController {
	@Autowired
	private LaptopRepository laptopRepository;
	
	@GetMapping("/laptop")
	public List<Laptop> getAll(){
		return laptopRepository.findAll();
	}
	//create
	@PostMapping("/laptop")
	public Laptop create(@RequestBody Laptop laptop) {
		return laptopRepository.save(laptop);
	}
	//get laptop by id rest api
	@GetMapping("/laptop/{id}")
	public ResponseEntity<Laptop> getLaptopById(@PathVariable Integer id) throws Exception{
		Laptop laptop=laptopRepository.findById(id).get();
		if(laptop == null) {
			throw new Exception();
		}else {
			return ResponseEntity.ok(laptop);
		}
	}
	//update
	@PutMapping("/laptop/{id}")
	public ResponseEntity<Laptop> updateLaptop(@PathVariable Integer id,@RequestBody Laptop laptopDetail) throws Exception{
		Laptop laptop=laptopRepository.findById(id).get();
		if(laptop== null) {
			throw new Exception();
		}else {
			laptop.setAmount(laptopDetail.getAmount());
			laptop.setLapTopName(laptopDetail.getLapTopName());
			laptop.setPrice(laptopDetail.getPrice());
			
			return ResponseEntity.ok(laptopRepository.save(laptop));
		}
	}
	//delete
	@DeleteMapping("/laptop/{id}")
	public ResponseEntity< Map<String, Boolean>> deleteLaptop(@PathVariable Integer id){
		Laptop laptop=laptopRepository.findById(id)
				.orElseThrow(()-> new ResourceAccessException("Laptop not exist with id : "+ id));
		laptopRepository.delete(laptop);
		Map<String , Boolean> response=new HashMap<>();
		response.put("delete", Boolean.TRUE);
		return ResponseEntity.ok(response);

	}
}
