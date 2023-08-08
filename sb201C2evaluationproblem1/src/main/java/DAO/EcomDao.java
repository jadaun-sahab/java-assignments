package DAO;

import java.util.List;
import java.util.Locale.Category;

import Models.Product;
import Models.Seller;

public interface EcomDao {
	public Seller addSeller(String name,String email,String no);
	public Product addProduct(String name,double price ,int quantity,Category category,int sellerId);
	public List<Product> getProductBySeller(int sellerId);
	public Product getProductById(int productId);

}
