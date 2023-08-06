package entity;

import java.util.Objects;

import jakarta.persistence.Entity;
@Entity
public class ChickenBiryani extends Biryani {
private int	ChickenBiryaniId ;
private int	price;
private String description;
public ChickenBiryani() {
	
}
	
	public ChickenBiryani(int chickenBiryaniId, int price, String description) {
		super();
		ChickenBiryaniId = chickenBiryaniId;
		this.price = price;
		this.description = description;
	}
	
	public int getChickenBiryaniId() {
		return ChickenBiryaniId;
	}
	public void setChickenBiryaniId(int chickenBiryaniId) {
		ChickenBiryaniId = chickenBiryaniId;
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
	
	@Override
	public String toString() {
		return "ChickenBiryani [ChickenBiryaniId=" + ChickenBiryaniId + ", price=" + price + ", description="
				+ description + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(ChickenBiryaniId, description, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChickenBiryani other = (ChickenBiryani) obj;
		return ChickenBiryaniId == other.ChickenBiryaniId && Objects.equals(description, other.description)
				&& price == other.price;
	}
	
	
}
