package com.book.bookroom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.book.bookroom.model.Member;
import com.book.bookroom.service.MemberService;

@CrossOrigin
@RestController
public class MemberController {


	@Autowired 
	private MemberService service;
	
	@GetMapping("/member")
    public List<Member> list() {
        return service.listAll();
    }
	
	@PostMapping("/member")
	public ResponseEntity<Member> save(@RequestBody Member member){
		
		service.save(member);
        return new ResponseEntity<Member>(HttpStatus.OK);
	}
	
}
