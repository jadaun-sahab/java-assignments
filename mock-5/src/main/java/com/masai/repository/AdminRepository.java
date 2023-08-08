package com.masai.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.masai.model.Book;

@Repository
public interface AdminRepository extends JpaRepository<Book, Integer>{

	public Book findByStockTitle(String title);
	
	public List<Book> findByTitleAndAuthor(String title, String author);


    Book findByTitle(String title);

}