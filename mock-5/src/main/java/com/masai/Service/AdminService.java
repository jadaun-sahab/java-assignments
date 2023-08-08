package com.masai.Service;

import java.util.List;
import com.masai.exception.BookException;
import com.masai.model.Book;

public interface AdminService {
	public Book createBook(Book book) throws BookException;

	public List<Book> getAllBooks() throws BookException;

	public Book findBookByISBN(Integer isbn) throws BookException;

	public List<Book> findByTitleAndAuthor(String title, String author) throws BookException;

	public Book updateBook(Book book, Integer isbn) throws BookException;

	public void deleteBook(Book book) throws BookException;
}