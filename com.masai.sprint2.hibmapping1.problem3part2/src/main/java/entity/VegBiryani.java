package entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.NamedQuery;
@Entity
@NamedQuery(name = "VegBiryani",query = "from VegBiryani where VegBiryaniId =:bal")
public class VegBiryani extends Biryani {

	private int  VegBiryaniId ;
	private int		price;
    private String  description;
    
    
    public VegBiryani() {
    	
    }
	public VegBiryani(int vegBiryaniId, int price, String description) {
		super();
		VegBiryaniId = vegBiryaniId;
		this.price = price;
		this.description = description;
	}
	public int getVegBiryaniId() {
		return VegBiryaniId;
	}
	public void setVegBiryaniId(int vegBiryaniId) {
		VegBiryaniId = vegBiryaniId;
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
		return "VegBiryani [VegBiryaniId=" + VegBiryaniId + ", price=" + price + ", description=" + description + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(VegBiryaniId, description, price);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (!super.equals(obj))
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		VegBiryani other = (VegBiryani) obj;
		
		return VegBiryaniId == other.VegBiryaniId && Objects.equals(description, other.description)
				&& price == other.price;
	}
    
}
