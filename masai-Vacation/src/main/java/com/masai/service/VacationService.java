package com.masai.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.masai.model.Property;
import com.masai.model.Reservation;
import com.masai.model.ReservationStatus;
import com.masai.model.Student;
import com.masai.model.User;
import com.masai.repo.PropertyRepository;
import com.masai.repo.ReservationRepository;
import com.masai.repo.UserRepository;

@Service
public class VacationService {

    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private PropertyRepository propertyRepository;
    
    @Autowired
    private ReservationRepository reservationRepository;
    
    @Autowired
    private PasswordEncoder passwordEncoder;

 
    public User registerUser(User user) {

        if (userRepository.findByEmail(user.getEmail()) != null) {
            throw new IllegalArgumentException("User with email already exists");
        }
        
        String hashedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(hashedPassword);
        
        return userRepository.save(user);
    }

 
    public User loginUser(String email, String password) {
        User user = userRepository.findByEmail(email);
        if (user == null) {
            throw new IllegalArgumentException("User with email not found");
        }
        
  
        if (!passwordEncoder.matches(password, user.getPassword())) {
            throw new IllegalArgumentException("Incorrect password");
        }
        
        return user;
    }

  
    public Property createProperty(Property property) {
        return propertyRepository.save(property);
    }

 
    public List<Property> searchProperties(String location, LocalDate startDate, LocalDate endDate) {
        return propertyRepository.findAvailableProperties(location, startDate, endDate);
    }

    
    public Reservation createReservation(Reservation reservation) {
        Property property = propertyRepository.findById(reservation.getPropertyId())
                .orElseThrow(() -> new IllegalArgumentException("Property not found"));
        if (!property.isAvailable(reservation.getStartDate(), reservation.getEndDate())) {
            throw new IllegalArgumentException("Property not available during the specified dates");
        }
     
      
        long numNights = ChronoUnit.DAYS.between(reservation.getStartDate(), reservation.getEndDate());
        BigDecimal totalPrice = property.getNightlyRate().multiply(new BigDecimal(numNights));
        reservation.setTotalPrice(totalPrice);
        
        
        return reservationRepository.save(reservation);
    }

    
    public List<Reservation> getReservationsByUserId(int userId) {
        return reservationRepository.findByUserId(userId);
    }

  
    public void cancelReservation(int reservationId) {
        Reservation reservation = reservationRepository.findById(reservationId)
                .orElseThrow(() -> new IllegalArgumentException("Reservation not found"));
        reservation.setStatus(ReservationStatus.CANCELLED);
        reservationRepository.save(reservation);
    }

    private Map<Integer,Property> map = new HashMap<>();
    public Property updateProperty(int propertyId, Property property) {
    	 if(map.containsKey(propertyId)) {
    		 Property existingProperty=map.get(propertyId);
			 existingProperty.setAvailability(property.getAvailability());
	        existingProperty.setNightlyRate(property.getNightlyRate());
			  
	        return propertyRepository.save(existingProperty);
		 }else {
			  throw new IllegalArgumentException("property does  not exist with this propertyId"+propertyId);
		 }     
    }
}
