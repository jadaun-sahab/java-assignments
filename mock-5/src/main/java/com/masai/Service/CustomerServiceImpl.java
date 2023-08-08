package com.masai.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.masai.exception.BookException;
import com.masai.model.Book;
import com.masai.repository.AdminRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private AdminRepository adminRepository;

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

}
