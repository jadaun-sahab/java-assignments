package entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;


@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Biryani {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int BiryaniId;
	private int rating;
	public int getBiryaniId() {
		return BiryaniId;
	}
	
	public void setBiryaniId(int biryaniId) {
		BiryaniId = biryaniId;
	}
	public int getRating() {
		return rating;
	}
	
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	@Override
	public String toString() {
		return "Biryani [BiryaniId=" + BiryaniId + ", rating=" + rating + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(BiryaniId, rating);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Biryani other = (Biryani) obj;
		return BiryaniId == other.BiryaniId && rating == other.rating;
	}
	
	
}
