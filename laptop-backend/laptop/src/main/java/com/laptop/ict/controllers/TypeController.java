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

import com.laptop.ict.models.Type;
import com.laptop.ict.services.TypeService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/")
public class TypeController {
	
	@Autowired
	private TypeService typeService;
	
	@GetMapping("/type")
	public List<Type> getAll(){
		return typeService.findAll();
	}
	
	//create
	@PostMapping("/type")
	public Type create(@RequestBody Type type) {
		return typeService.save(type);
	}
	
	//get data by id
	@GetMapping("/type/{id}")
	public ResponseEntity<Type> getTypeById(@PathVariable Integer id) throws Exception{
		Type type = typeService.findById(id).get();
		if(type == null) {
			throw new Exception();
		}else {
			return ResponseEntity.ok(type);
		}
	}
	
	//update
	@PutMapping("/type/{id}")
	public ResponseEntity<Type> updateType(@PathVariable Integer id, @RequestBody Type typeNew) throws Exception{
		Type type = typeService.findById(id).get();
		if(type == null) {
			throw new Exception();
		}else {
			type.setTypeName(typeNew.getTypeName());
			
			return ResponseEntity.ok(typeService.save(type));
		}
	}
	
	//delete
	@DeleteMapping("/type/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteType(@PathVariable Integer id){
		Type type = typeService.findById(id).orElseThrow(() -> new ResourceAccessException("Type not exist with id:" + id) );
		typeService.delete(type);
		Map<String, Boolean> response = new HashMap<>();
		response.put("delete", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}

}
