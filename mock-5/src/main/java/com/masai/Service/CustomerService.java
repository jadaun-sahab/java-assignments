package com.masai.Service;

import java.util.List;

import com.masai.exception.BookException;
import com.masai.model.Book;

public interface CustomerService {
	
	
	public List<Book> getAllBooks() throws BookException;

	public Book findBookByISBN(Integer isbn) throws BookException;

	public List<Book> findByTitleAndAuthor(String title, String author) throws BookException;

	
}
