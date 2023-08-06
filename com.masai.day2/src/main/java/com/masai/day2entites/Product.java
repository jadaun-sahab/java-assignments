package com.masai.day2entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {

	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int productid;
	private String productname;
	private int quantity;
	private int price;
	private String productbname;
	

	public Product() {
		super();
	}


	public Product(String productname, int quantity, int price, String productbname) {
		super();
		this.productname = productname;
		this.quantity = quantity;
		this.price = price;
		this.productbname = productbname;
	}


	public Product(int productid, String productname, int quantity, int price, String productbname) {
		this.productid = productid;
		this.productname = productname;
		this.quantity = quantity;
		this.price = price;
		this.productbname = productbname;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getProductbname() {
		return productbname;
	}

	public void setProductbname(String productbname) {
		this.productbname = productbname;
	}

	@Override
	public String toString() {
		return "productid=" + productid + ", productname=" + productname + ", quantity=" + quantity
				+ ", price=" + price + ", productbname=" + productbname ;
	}

	
}
