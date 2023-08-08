package Models;

import java.util.Objects;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQuery;

@Entity
@NamedQuery(name = "Tea",query = "from Tea where teaId =:bal")
public class Tea extends Beverage{
	private int teaId;
	private int price;
	private String description;
	private String flavor;
	public Tea(int teaId, int price, String description, String flavor) {
		super();
		this.teaId = teaId;
		this.price = price;
		this.description = description;
		this.flavor = flavor;
	}
	public int getTeaId() {
		return teaId;
	}
	public void setTeaId(int teaId) {
		this.teaId = teaId;
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
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	@Override
	public String toString() {
		return "Tea [teaId=" + teaId + ", price=" + price + ", description=" + description + ", flavor=" + flavor + "]";
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(teaId, description, price);
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
		Tea other = (Tea) obj;
		return teaId == other.teaId && Objects.equals(description, other.description)
				&& price == other.price;
	}
	
	
}
