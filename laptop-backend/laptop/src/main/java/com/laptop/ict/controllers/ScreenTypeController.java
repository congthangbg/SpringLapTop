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

import com.laptop.ict.models.ScreenType;
import com.laptop.ict.repositorys.ScreenTypeRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/")
public class ScreenTypeController {

	@Autowired
	private ScreenTypeRepository screenTypeRepository;
	
	@GetMapping("/screentype")
	public List<ScreenType> getAll(){
		return screenTypeRepository.findAll();
	}
	
	//create
	@PostMapping("/screentype")
	public ScreenType create(@RequestBody ScreenType screentype) {
		return screenTypeRepository.save(screentype);
	}
	
	//get data by id 
	@GetMapping("/screentype/{id}")
	public ResponseEntity<ScreenType> getScreenTypeById(@PathVariable Integer id) throws Exception{
		ScreenType screentype = screenTypeRepository.findById(id).get();
		if(screentype == null) {
			throw new Exception();
		}else {
			return ResponseEntity.ok(screentype);
		}
	}
	
	//update
	@PutMapping("/screentype/{id}")
	public ResponseEntity<ScreenType> updateScreenType(@PathVariable Integer id, @RequestBody ScreenType screenTypeNew) throws Exception{
		ScreenType screentype = screenTypeRepository.findById(id).get();
		if(screentype == null) {
			throw new Exception();
		}else {
			screentype.setSize(screenTypeNew.getSize());
			screentype.setResolution(screenTypeNew.getResolution());
			screentype.setTechnology(screenTypeNew.getTechnology());
			screentype.setInduction(screenTypeNew.getInduction());
			screentype.setLaptopdetail(screenTypeNew.getLaptopdetail());
			
			return ResponseEntity.ok(screenTypeRepository.save(screentype));
			
		}
	}
	
	//delete
	@DeleteMapping("/screentype/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteScreenType(@PathVariable Integer id){
		ScreenType screentype = screenTypeRepository.findById(id).orElseThrow(() -> new ResourceAccessException("ScreenType not exist with id:" + id));
		screenTypeRepository.delete(screentype);
		Map<String, Boolean> response = new HashMap<>();
		response.put("delete", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	
}
