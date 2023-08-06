package com.masai.model;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer roomId;

     

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hotelId")
    private Hotel hotel;

    @NotEmpty(message = "Room type name is required")
    private String name;

    @NotEmpty(message = "Room description is required")
    private String description;

    @Min(value = 1, message = "Capacity should be at least 1")
    private Integer capacity;

    @Min(value = 1, message = "Price should be at least 1")
    private Double price;

    @Enumerated(EnumType.STRING)
    private RoomType type;

    @OneToMany(mappedBy = "roomType", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Booking> bookings = new ArrayList<>();
    }

