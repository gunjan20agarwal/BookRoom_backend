package com.book.bookroom.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book.bookroom.model.*;


@Repository("bookRepository")
public interface BookRepo extends JpaRepository<Book, Integer>{

		public List<Book> findBySubCategoryId(int id);
}