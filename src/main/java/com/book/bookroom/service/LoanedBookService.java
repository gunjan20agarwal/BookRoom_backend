package com.book.bookroom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.book.bookroom.model.*;
import com.book.bookroom.repo.*;

@Component
@Service
public class LoanedBookService {

	@Autowired
	private LoanedBookRepo repo;
	
	public List<Loaned_Book> listAll() {
        return repo.findAll();
    }
     
    public void save(Loaned_Book loanedBook) {
        repo.save(loanedBook);
    }
     
}
