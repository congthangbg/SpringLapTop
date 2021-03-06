package com.laptop.ict.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
import org.springframework.web.client.ResourceAccessException;

import com.laptop.ict.models.Laptop;
import com.laptop.ict.services.LaptopService;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/")
public class LaptopController {
	@Autowired
	private LaptopService laptopService;
	
	@GetMapping("/laptop")
	public List<Laptop> getAll(){
		return laptopService.findAll();
	}
	 @GetMapping("/laptop/page")
	  public Page<Laptop> listCustomer(
	      @RequestParam(name = "page", required = false, defaultValue = "0") Integer page,
	      @RequestParam(name = "size", required = false, defaultValue = "3") Integer size,
	      @RequestParam(name = "sort", required = false, defaultValue = "ASC") String sort) {
	    Sort sortable = null;
	    if (sort.equals("ASC")) {
	      sortable = Sort.by("id").ascending();
	    }
	    if (sort.equals("DESC")) {
	      sortable = Sort.by("id").descending();
	    }
	    Pageable pageable = PageRequest.of(page, size, sortable);
	    
	     
	    return laptopService.findPageLaptop(pageable);
	  }
	//create
	@PostMapping("/laptop")
	public Laptop create(@RequestBody Laptop laptop) {
		System.out.println(laptop);
		return laptopService.save(laptop);
	}
	//get laptop by id rest api
	@GetMapping("/laptop/{id}")
	public ResponseEntity<Laptop> getLaptopById(@PathVariable Integer id) throws Exception{
		Laptop laptop=laptopService.findById(id).get();
		if(laptop == null) {
			throw new Exception();
		}else {
			return ResponseEntity.ok(laptop);
		}
	}
	//update
	@PutMapping("/laptop/{id}")
	public ResponseEntity<Laptop> updateLaptop(@PathVariable Integer id,@RequestBody Laptop laptopDetail) throws Exception{
		Laptop laptop=laptopService.findById(id).get();
		if(laptop== null) {
			throw new Exception();
		}else {
			laptop.setLapTopName(laptopDetail.getLapTopName());
			laptop.setPrice(laptopDetail.getPrice());
			laptop.setImage(laptopDetail.getImage());
			return ResponseEntity.ok(laptopService.save(laptop));
		}
	}
	//delete
	@DeleteMapping("/laptop/{id}")
	public ResponseEntity< Map<String, Boolean>> deleteLaptop(@PathVariable Integer id){
		Laptop laptop=laptopService.findById(id)
				.orElseThrow(()-> new ResourceAccessException("Laptop not exist with id : "+ id));
		laptopService.delete(laptop);
		Map<String , Boolean> response=new HashMap<>();
		response.put("delete", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
}
