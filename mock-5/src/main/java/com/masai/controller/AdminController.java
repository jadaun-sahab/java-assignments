package com.masai.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.masai.Service.AdminService;
import com.masai.exception.BookException;
import com.masai.model.Book;

@RestController
@RequestMapping("/MasaiBookstore")
public class AdminController {
	@Autowired
	private AdminService adminService;

	@PostMapping("/addBook")
	public ResponseEntity<Book> saveStock(@RequestBody Book book) throws BookException {

		Book book2 = adminService.createBook(book);

		return new ResponseEntity<Book>(book2, HttpStatus.CREATED);
	}

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
	public ResponseEntity<List<Book>> findBooksByTitleAndAuthor(@PathVariable String title,String author) throws BookException {
		List<Book> book = adminService.findByTitleAndAuthor(title,author);

		return new ResponseEntity<>(book, HttpStatus.OK);
	}
	

	@DeleteMapping("/deleteBook/{isbn}")
	public ResponseEntity<Book> deleteCustomerAccount(@PathVariable Integer isbn)
			throws  BookException {
		Book book = adminService.findBookByISBN(isbn);
		
		adminService.deleteBook(book);
		
		return new ResponseEntity<>(book, HttpStatus.OK);
	}

}
