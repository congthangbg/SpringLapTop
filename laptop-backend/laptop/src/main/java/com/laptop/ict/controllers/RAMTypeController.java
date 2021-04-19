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

import com.laptop.ict.models.RAMType;
import com.laptop.ict.repositorys.RAMTypeRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/")
public class RAMTypeController {
	
	@Autowired
	private RAMTypeRepository ramTypeRepository;
	
	//get
	@GetMapping("/ramtype")
	public List<RAMType> getAll(){
		return ramTypeRepository.findAll();
	}
	
	//create
	@PostMapping("/ramtype")
	public RAMType create(@RequestBody RAMType ramtype) {
		return ramTypeRepository.save(ramtype);
	}
	
	//get data by id
	@GetMapping("/ramtype/{id}")
	public ResponseEntity<RAMType> getRAMTypeById(@PathVariable Integer id) throws Exception{
		RAMType ramtype = ramTypeRepository.findById(id).get();
		if(ramtype == null) {
			throw new Exception();
		}else {
			return ResponseEntity.ok(ramtype);
		}
	}
	
	//update
	@PutMapping("/ramtype/{id}")
	public ResponseEntity<RAMType> updateRAMType(@PathVariable Integer id, @RequestBody RAMType ramTypeNew) throws Exception{
		RAMType ramtype = ramTypeRepository.findById(id).get();
		if(ramtype == null) {
			throw new Exception();
		}else {
			ramtype.setGb(ramTypeNew.getGb());
			ramtype.setRamType(ramTypeNew.getRamType());
			ramtype.setSpeed(ramTypeNew.getSpeed());
			ramtype.setLaptopdetail(ramTypeNew.getLaptopdetail());
			
			return ResponseEntity.ok(ramTypeRepository.save(ramtype));
		}
	}
	
	//delete
	@DeleteMapping("/ramtype/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteRAMType(@PathVariable Integer id){
		RAMType ramtype = ramTypeRepository.findById(id).orElseThrow(() -> new ResourceAccessException("RAMType not exist with id:" + id) );
		ramTypeRepository.delete(ramtype);
		Map<String, Boolean> response = new HashMap<>();
		response.put("delete", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	

}
