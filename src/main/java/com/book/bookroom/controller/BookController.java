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

import com.book.bookroom.model.Book;
import com.book.bookroom.service.BookService;

@CrossOrigin
@RestController
public class BookController {


	@Autowired 
	private BookService service;
	
	@GetMapping("/book")
    public List<Book> list() {
        return service.listAll();
    }
	
	@PostMapping("/book")
	public ResponseEntity<Book> save(@RequestBody Book book){
		
		service.save(book);
        return new ResponseEntity<Book>(HttpStatus.OK);
	}
	
	@PutMapping("/book/{id}")
    public ResponseEntity<?> update(@RequestBody Book book, @PathVariable int id) {
        try {
            Book existBook = service.get(id);
            service.save(book);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }      
    }
	
	@DeleteMapping("/book/{id}")
    public void delete(@PathVariable int id) {
    	service.delete(id);
    }
	
	@GetMapping("/book/{book_id}")
	public ResponseEntity<Book> get(@PathVariable("book_id") int id) {
        try {
            Book book = service.get(id);
            return new ResponseEntity<Book>(book, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Book>(HttpStatus.NOT_FOUND);
        } 
	}
        @GetMapping("subCategory/{subCategory_id}/books")
    	public ResponseEntity<List<Book>> getBookBySubCategory(@PathVariable("subCategory_id") String id) {
            try {
                List<Book> book = service.getBySubCategory(Integer.parseInt(id));
                
                return new ResponseEntity<List<Book>>(book, HttpStatus.OK);
            } catch (NoSuchElementException e) {
                return new ResponseEntity<List<Book>>(HttpStatus.NOT_FOUND);
            }    
        
    }
        
        @GetMapping("category/{category_id}/books")
    	public ResponseEntity<List<Book>> getBookByCategory(@PathVariable("category_id") String id) {
            try {
                List<Book> book = service.getByCategory(Integer.parseInt(id));
                
                return new ResponseEntity<List<Book>>(book, HttpStatus.OK);
            } catch (NoSuchElementException e) {
                return new ResponseEntity<List<Book>>(HttpStatus.NOT_FOUND);
            }    
        
    }        
	
}
