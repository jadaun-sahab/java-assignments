package Models;

import java.util.Objects;
import jakarta.persistence.Entity;

@Entity
public class Coffee  extends Beverage{
	
	private int coffeeId; 
	private int price;
	private String description;
	private String origin;
	public Coffee(int coffeeId, int price, String description, String origin) {
		super();
		this.coffeeId = coffeeId;
		this.price = price;
		this.description = description;
		this.origin = origin;
	}
	public int getCoffeeId() {
		return coffeeId;
	}
	public void setCoffeeId(int coffeeId) {
		this.coffeeId = coffeeId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	@Override
	public String toString() {
		return "Coffee [coffeeId=" + coffeeId + ", price=" + price + ", description=" + description + ", origin="
				+ origin + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(coffeeId, description, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coffee other = (Coffee) obj;
		return coffeeId == other.coffeeId && Objects.equals(description, other.description)
				&& price == other.price;
	}
	
}
