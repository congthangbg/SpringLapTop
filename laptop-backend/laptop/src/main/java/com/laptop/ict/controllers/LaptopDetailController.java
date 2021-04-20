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

import com.laptop.ict.models.LaptopDetail;
import com.laptop.ict.services.LaptopDetailService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/")
public class LaptopDetailController {

	@Autowired
	private LaptopDetailService laptopDetailService;
	
	@GetMapping("/laptopdetail")
	public List<LaptopDetail> getAll(){
		return laptopDetailService.findAll();
	}
	
	//create
	@PostMapping("/laptopdetail")
	public LaptopDetail create(@RequestBody LaptopDetail laptopdetail) {
		return laptopDetailService.save(laptopdetail);
	}
	
	//get data by id
	@GetMapping("/laptopdetail/{id}")
	public ResponseEntity<LaptopDetail> getLaptopDetailById(@PathVariable Integer id) throws Exception{
		LaptopDetail laptopdetail = laptopDetailService.findById(id).get();
		if(laptopdetail == null) {
			throw new Exception();
		}else {
			return ResponseEntity.ok(laptopdetail);
		}
	}
	
	//update
	@PutMapping("/laptopdetail/{id}")
	public ResponseEntity<LaptopDetail>updateLaptopDetail(@PathVariable Integer id, @RequestBody LaptopDetail laptopDetailNew ) throws Exception{
		LaptopDetail laptopdetail = laptopDetailService.findById(id).get();
		if(laptopdetail == null) {
			throw new Exception();
		}else {
			laptopdetail.setCpu(laptopDetailNew.getCpu());
			laptopdetail.setRom(laptopDetailNew.getRom());
			laptopdetail.setKeyBoard(laptopDetailNew.getKeyBoard());
			laptopdetail.setSystem(laptopDetailNew.getSystem());
			laptopdetail.setColor(laptopDetailNew.getColor());
			laptopdetail.setConnector(laptopDetailNew.getConnector());
			laptopdetail.setCamera(laptopDetailNew.getCamera());
			laptopdetail.setAudio(laptopDetailNew.getAudio());
			laptopdetail.setPin(laptopDetailNew.getPin());
			laptopdetail.setSize(laptopDetailNew.getSize());
			laptopdetail.setWeight(laptopDetailNew.getWeight());
			laptopdetail.setComponent(laptopDetailNew.getComponent());
			laptopdetail.setYear(laptopDetailNew.getYear());
			laptopdetail.setRamtypes(laptopDetailNew.getRamtypes());
			laptopdetail.setScreentypes(laptopDetailNew.getScreentypes());
			
			return ResponseEntity.ok(laptopDetailService.save(laptopdetail));
		}
	}
	
	//delete
	@DeleteMapping("/laptopdetail/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteLaptopDetail(@PathVariable Integer id){
		LaptopDetail laptopdetail = laptopDetailService.findById(id).orElseThrow(() -> new ResourceAccessException("LaptopDetail not exist with id:" + id) );
		laptopDetailService.delete(laptopdetail);
		Map<String, Boolean> response = new HashMap<>();
		response.put("delete", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	
}
