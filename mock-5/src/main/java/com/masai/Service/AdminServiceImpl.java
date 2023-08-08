package com.masai.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.masai.exception.BookException;
import com.masai.model.Book;
import com.masai.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepository adminRepository;

	@Override
	public Book createBook(Book book) throws BookException {
		Book existingBook = adminRepository.findByStockTitle(book.getTitle());

		if (existingBook != null)
			throw new BookException("Book Already Registered with this title");

		return adminRepository.save(book);
	}

	@Override
	public List<Book> getAllBooks() throws BookException {
		List<Book> books = adminRepository.findAll();
		if (books.size() == 0) {
			throw new BookException("No Book Found");
		}
		return books;
	}

	@Override
	public Book findBookByISBN(Integer isbn) throws BookException {
		Optional<Book> book = adminRepository.findById(isbn);

		if (book == null)
			throw new BookException("No Book Found With this isbn");

		return book.get();
	}

	@Override
	public List<Book> findByTitleAndAuthor(String title, String author) throws BookException {
		List<Book> books = adminRepository.findByTitleAndAuthor(title, author);
		if (books.size() == 0) {
			throw new BookException("No Book Found");
		}
		return books;
	}

	@Override
	public Book updateBook(Book book, Integer isbn) throws BookException {
		Optional<Book> book2 = adminRepository.findById(isbn);

		if (book2 == null) {
			throw new BookException("Please provide a valid isbn to update a Book");
		}
		return adminRepository.save(book);

	}

	@Override
	public void deleteBook(Book book) throws BookException {
		adminRepository.delete(book);

	}

}
