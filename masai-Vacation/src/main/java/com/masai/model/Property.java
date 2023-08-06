package com.masai.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "properties")
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long property_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id")
    private User owner;

    @Enumerated(EnumType.STRING)
    private PropertyType property_type;

    private String address;

    private Integer number_of_rooms;

    private String location;

    @ElementCollection(targetClass = Amenity.class)
    @CollectionTable(name = "property_amenities", joinColumns = @JoinColumn(name = "property_id"))
    @Enumerated(EnumType.STRING)
    private List<Amenity> amenities;

	public Property() {
		super();
	}

	public Property(Long property_id, User owner, PropertyType property_type, String address, Integer number_of_rooms,
			String location, List<Amenity> amenities) {
		super();
		this.property_id = property_id;
		this.owner = owner;
		this.property_type = property_type;
		this.address = address;
		this.number_of_rooms = number_of_rooms;
		this.location = location;
		this.amenities = amenities;
	}

	public Long getProperty_id() {
		return property_id;
	}

	public void setProperty_id(Long property_id) {
		this.property_id = property_id;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	public PropertyType getProperty_type() {
		return property_type;
	}

	public void setProperty_type(PropertyType property_type) {
		this.property_type = property_type;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getNumber_of_rooms() {
		return number_of_rooms;
	}

	public void setNumber_of_rooms(Integer number_of_rooms) {
		this.number_of_rooms = number_of_rooms;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Amenity> getAmenities() {
		return amenities;
	}

	public void setAmenities(List<Amenity> amenities) {
		this.amenities = amenities;
	}

	public boolean isAvailable(LocalDate startDate, LocalDate endDate) {
		return false;
	}

	public BigDecimal getNightlyRate() {
		return null;
	}

	public void setNightlyRate(BigDecimal nightlyRate) {
		
	}

	public Object getAvailability() {
		return null;
	}

	public void setAvailability(Object availability) {
		
	}

   
}
