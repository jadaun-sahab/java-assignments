package com.masai.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.Property;

public abstract class PropertyRepository implements JpaRepository<Property, Integer>{

	public List<Property> findAvailableProperties(String location, LocalDate startDate, LocalDate endDate) {
		return null;
	}

	public Object findById(int propertyId) {
		return null;
	}

	public Property save(Property existingProperty) {
		return null;
	}

	public Object findById(Long propertyId) {
		return null;
	}

}
