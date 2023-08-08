package DAO;

import java.util.List;
import java.util.Locale.Category;
import Connection.EMUtils;
import Models.Product;
import Models.Seller;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class EcomDaoImpl implements EcomDao{

	public Seller addSeller(String name, String email, String no) {
		EntityManager em=EMUtils.provideEntityManager();
		Seller s=new Seller();
		s.setName(name);
		s.setEmail(email);
		s.setMob(no);
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		em.close();
		return s;
	}

	public Product addProduct(String name, double price, int quantity, Category category, int sellerId) {
		
			EntityManager em=EMUtils.provideEntityManager();
			Seller seller=em.find(Seller.class, sellerId);
			if(seller==null)
				throw new RuntimeException("Seller not found"+sellerId);
			Product product=new Product();
			product.setName(name);
			product.setPrice(price);
			product.setQuantity(quantity);
			product.setCategory(category);
			product.setSeller(seller);
			em.getTransaction().begin();
			em.persist(product);
			em.getTransaction().commit();
			em.close();
			return product;
		}
	

	
		public List<Product> getProductBySeller(int sellerId) {
			EntityManager em=EMUtils.provideEntityManager();
			Seller s=em.find(Seller.class, sellerId);
			if(s==null)
				throw new RuntimeException("Seller not found"+sellerId);
			
			TypedQuery<Product> query = em.createQuery("select p from Product p where p.seller=:seller ",Product.class);
			query.setParameter("seller", sellerId);
			
			return query.getResultList();
	}

	public Product getProductById(int productId) {
		EntityManager em=EMUtils.provideEntityManager();
		Product p= new Product();
		if(p==null){
			throw new RuntimeException("product not found");
		}
		return p;
	}

	

}
