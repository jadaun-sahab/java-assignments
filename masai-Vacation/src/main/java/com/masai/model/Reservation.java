package com.masai.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "reservations")
public class Reservation {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reservationId;
    
    @NotNull(message = "User Id is mandatory")
    private Long userId;
    
    @NotNull(message = "Property Id is mandatory")
    private Long propertyId;
    
    @NotNull(message = "Start Date is mandatory")
    private LocalDate startDate;
    
    @NotNull(message = "End Date is mandatory")
    private LocalDate endDate;
    
    @NotNull(message = "Number of guests is mandatory")
    @Min(value = 1, message = "Number of guests must be greater than or equal to 1")
    private Integer numberOfGuests;
    
    @NotNull(message = "Total Price is mandatory")
    private BigDecimal totalPrice;
    
    @Enumerated(EnumType.STRING)
    private ReservationStatus status;

	public Reservation() {
		super();
	}

	public Reservation(Long reservationId, @NotNull(message = "User Id is mandatory") Long userId,
			@NotNull(message = "Property Id is mandatory") Long propertyId,
			@NotNull(message = "Start Date is mandatory") LocalDate startDate,
			@NotNull(message = "End Date is mandatory") LocalDate endDate,
			@NotNull(message = "Number of guests is mandatory") @Min(value = 1, message = "Number of guests must be greater than or equal to 1") Integer numberOfGuests,
			@NotNull(message = "Total Price is mandatory") BigDecimal totalPrice, ReservationStatus status) {
		super();
		this.reservationId = reservationId;
		this.userId = userId;
		this.propertyId = propertyId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.numberOfGuests = numberOfGuests;
		this.totalPrice = totalPrice;
		this.status = status;
	}

	public Long getReservationId() {
		return reservationId;
	}

	public void setReservationId(Long reservationId) {
		this.reservationId = reservationId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(Long propertyId) {
		this.propertyId = propertyId;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public Integer getNumberOfGuests() {
		return numberOfGuests;
	}

	public void setNumberOfGuests(Integer numberOfGuests) {
		this.numberOfGuests = numberOfGuests;
	}

	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}

	public ReservationStatus getStatus() {
		return status;
	}

	public void setStatus(ReservationStatus status) {
		this.status = status;
	}
    
    
}