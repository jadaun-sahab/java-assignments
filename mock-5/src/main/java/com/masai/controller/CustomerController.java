package com.masai.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Service.AdminService;
import com.masai.exception.BookException;
import com.masai.model.Book;

@RestController
public class CustomerController {

	@Autowired
	private AdminService adminService;

	@GetMapping("/allBooks")
	public ResponseEntity<List<Book>> getAllCustomers() throws BookException {

		List<Book> books = adminService.getAllBooks();

		return new ResponseEntity<>(books, HttpStatus.OK);
	}

	@GetMapping("/{isbn}/findBookByISBN")
	public ResponseEntity<Book> getStockReport(@PathVariable Integer isbn) throws BookException {
		Book book = adminService.findBookByISBN(isbn);

		return new ResponseEntity<>(book, HttpStatus.OK);
	}

	@GetMapping("/{title}/{author}/findBookByTitleAndAuthor")
	public ResponseEntity<List<Book>> findBooksByTitleAndAuthor(@PathVariable String title, String author)
			throws BookException {
		List<Book> book = adminService.findByTitleAndAuthor(title, author);

		return new ResponseEntity<>(book, HttpStatus.OK);
	}

}
