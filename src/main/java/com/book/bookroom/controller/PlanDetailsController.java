package com.book.bookroom.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.book.bookroom.model.Plan_Details;
import com.book.bookroom.service.PlanDetailService;

@CrossOrigin
@RestController
public class PlanDetailsController {

	@Autowired 
	private PlanDetailService service;
	
	@GetMapping("/planDetails")
    public List<Plan_Details> list() {
        return service.listAll();
    }
	
	@PostMapping("/planDetails")
	public ResponseEntity<Plan_Details> save(@RequestBody Plan_Details planDetails){
		
		service.save(planDetails);
        return new ResponseEntity<Plan_Details>(HttpStatus.OK);
	}
	
	@PutMapping("/planDetails/{id}")
    public ResponseEntity<?> update(@RequestBody Plan_Details planDetails, @PathVariable int id) {
        try {
        	Plan_Details existPlan = service.get(id);
            service.save(planDetails);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }      
    }
	
	@DeleteMapping("/planDetails/{id}")
    public void delete(@PathVariable int id) {
    	service.delete(id);
    }
	
}
