package com.masai.model;

import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

	@Entity
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public class Booking {
		    @Id
		    @GeneratedValue(strategy = GenerationType.IDENTITY)
		    private Integer bookingId;

		    @ManyToOne(fetch = FetchType.LAZY)
		    @JoinColumn(name = "customerId")
		    private Customer customer;

		    @ManyToOne(fetch = FetchType.LAZY)
		    @JoinColumn(name = "roomId")
		    private RoomType roomType;

		    @NotNull(message = "Booking date is required")
		    @FutureOrPresent(message = "Booking date should be in the future or present")
		    private LocalDate bookingDate;

		    @Enumerated(EnumType.STRING)
		    private BookingStatus status;
}
