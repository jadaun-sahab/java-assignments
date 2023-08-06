package com.masai.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hotel {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer hotelId;

	    @NotEmpty(message = "Hotel can not be empty")
	    private String name;

	    @NotEmpty(message = "City  can not be empty")
	    private String city;

	    @NotEmpty(message = "Address  can not be empty")
	    private String address;

	    @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	    private List<RoomType> roomTypes = new ArrayList<>();
	
}
