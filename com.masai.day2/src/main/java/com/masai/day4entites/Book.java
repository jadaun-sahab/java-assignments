package com.masai.day4entites;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
	
	@Id
	int BookId;
	String name;
	String author;
	String publication;
	String category;
	int pages;
	int price;
	String created_timestamp;
	
	
	
	public Book() {
		super();
	}



	public Book(int bookId, String name, String author, String publication, String category, int pages, int price,
			String created_timestamp) {
		BookId = bookId;
		this.name = name;
		this.author = author;
		this.publication = publication;
		this.category = category;
		this.pages = pages;
		this.price = price;
		this.created_timestamp = created_timestamp;
	}



	public int getBookId() {
		return BookId;
	}



	public void setBookId(int bookId) {
		BookId = bookId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public String getPublication() {
		return publication;
	}



	public void setPublication(String publication) {
		this.publication = publication;
	}



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}



	public int getPages() {
		return pages;
	}



	public void setPages(int pages) {
		this.pages = pages;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public String getCreated_timestamp() {
		return created_timestamp;
	}



	public void setCreated_timestamp(String created_timestamp) {
		this.created_timestamp = created_timestamp;
	}



	@Override
	public String toString() {
		return "BookId=" + BookId + ", name=" + name + ", author=" + author + ", publication=" + publication
				+ ", category=" + category + ", pages=" + pages + ", price=" + price + ", created_timestamp="
				+ created_timestamp ;
	}
	
	
}
