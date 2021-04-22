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

import com.laptop.ict.models.Brand;
import com.laptop.ict.repositorys.BrandRepository;
import com.laptop.ict.services.BrandService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/")
public class BrandController {
	@Autowired
	private BrandRepository brandService;
	
	@GetMapping("/brand")
	public List<Brand> getAll(){
		return brandService.findAll();
	}
	//create
	@PostMapping("/brand")
	public Brand create(@RequestBody Brand brand) {
		return brandService.save(brand);
	}
	//get Brand by id rest api
	@GetMapping("/brand/{id}")
	public ResponseEntity<Brand> getBrandById(@PathVariable Integer id) throws Exception{
		Brand brand=brandService.findById(id).get();
		if(brand == null) {
			throw new Exception();
		}else {
			return ResponseEntity.ok(brand);
		}
	}
	//update
	@PutMapping("/brand/{id}")
	public ResponseEntity<Brand> updateBrand(@PathVariable Integer id,@RequestBody Brand brandDetail) throws Exception{
		Brand brand=brandService.findById(id).get();
		if(brand== null) {
			throw new Exception();
		}else {
			brand.setBrandName(brandDetail.getBrandName());

			return ResponseEntity.ok(brandService.save(brand));
		}
	}
	//delete
	@DeleteMapping("/brand/{id}")
	public ResponseEntity< Map<String, Boolean>> deleteBrand(@PathVariable Integer id){
		Brand brand=brandService.findById(id)
				.orElseThrow(()-> new ResourceAccessException("Brand not exist with id : "+ id));
		brandService.delete(brand);
		Map<String , Boolean> response=new HashMap<>();
		response.put("delete", Boolean.TRUE);
		return ResponseEntity.ok(response);

	}
}
