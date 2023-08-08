package Models;

import java.util.Objects;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Beverage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int beverageId;
	private int rating;
	public int getBeverageId() {
		return beverageId;
	}
	public void setBeverageId(int beverageId) {
		this.beverageId = beverageId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Beverage [beverageId=" + beverageId + ", rating=" + rating + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(beverageId, rating);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Beverage other = (Beverage) obj;
		return beverageId == other.beverageId && rating == other.rating;
	}
	
	
	
	
}
