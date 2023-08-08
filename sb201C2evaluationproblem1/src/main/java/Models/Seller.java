package Models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

	@Entity
	@Table(name = "seller")
	public class Seller {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		 int sellerId;
			String name;
			String email;
			String mob;
	@OneToMany(mappedBy = "seller",cascade = CascadeType.ALL)
	List<Product>products;
	public Seller() {
		super();
	}
		public Seller( String name, String email, String mob, List<Product> products) {
		
			
			this.name = name;
			this.email = email;
			this.mob = mob;
			this.products = products;
		}
		public int getSellerId() {
			return sellerId;
		}
		public void setSellerId(int sellerId) {
			this.sellerId = sellerId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getMob() {
			return mob;
		}
		public void setMob(String mob) {
			this.mob = mob;
		}
		public List<Product> getProducts() {
			return products;
		}
		public void setProducts(List<Product> products) {
			this.products = products;
		}

}

