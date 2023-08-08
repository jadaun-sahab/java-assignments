package Models;

import java.util.Locale.Category;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Product {
	@Id
	@Column(name = "product_id")
	int productId;
	String name;
	double price;
	int quantity;
	@Column(name = "category")
	@Enumerated(EnumType.STRING)
	Category category;
	@ManyToOne
	@JoinColumn(name = "seller_id")
	Seller seller;


public Product(int productId, String name, double price, int quantity, Category category, Seller seller) {
	this.productId = productId;
	this.name = name;
	this.price = price;
	this.quantity = quantity;
	this.category = category;
	this.seller = seller;
}


	public Product() {
		super();
	}
	
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Seller getSeller() {
		return seller;
	}
	public void setSeller(Seller seller) {
		this.seller = seller;
	}
}