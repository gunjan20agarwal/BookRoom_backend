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

import com.book.bookroom.model.SubCategory;
import com.book.bookroom.service.SubCategoryService;


@CrossOrigin
@RestController
public class SubCategoryController {

	@Autowired 
	private SubCategoryService service;
	
	@GetMapping("/subCategory")
    public List<SubCategory> list() {
        return service.listAll();
    }
	
	@PostMapping("/subCategory")
	public ResponseEntity<SubCategory> save(@RequestBody SubCategory subCategory){
		
		service.save(subCategory);
        return new ResponseEntity<SubCategory>(HttpStatus.OK);
	}
	
	@PutMapping("/subCategory/{id}")
    public ResponseEntity<?> update(@RequestBody SubCategory subCategory, @PathVariable int id) {
        try {
            SubCategory existSubCategory = service.get(id);
            service.save(subCategory);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }      
    }
	
	@DeleteMapping("/subCategory/{id}")
    public void delete(@PathVariable int id) {
    	service.delete(id);
    }
	
	@GetMapping("/{subCategory_id}/subCategory")
	public ResponseEntity<SubCategory> get(@PathVariable ("subCategory_id") int id) {
        try {
            SubCategory existSubCategory = service.get(id);
            return new ResponseEntity<SubCategory>(existSubCategory, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<SubCategory>(HttpStatus.NOT_FOUND);
        } 
    
    }
}
