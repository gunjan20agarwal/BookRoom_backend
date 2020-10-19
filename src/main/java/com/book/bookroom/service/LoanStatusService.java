package com.book.bookroom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.book.bookroom.model.*;
import com.book.bookroom.repo.*;

@Component
@Service
public class LoanStatusService {

	@Autowired
	private LoanStatusRepo repo;
	
	public List<Loan_Status> listAll() {
        return repo.findAll();
    }
     
    public void save(Loan_Status loanStatus) {
        repo.save(loanStatus);
    }
     
}
