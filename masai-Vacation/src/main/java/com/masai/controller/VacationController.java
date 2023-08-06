package com.masai.controller;

import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.masai.model.Property;
import com.masai.model.Reservation;
import com.masai.model.User;
import com.masai.service.VacationService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/vacation")
public class VacationController {

    @Autowired
    private VacationService vacationService;

    @PostMapping("/vacation/register")
    public ResponseEntity<User> registerUser(@Valid  @RequestBody User user) {
        User createdUser = vacationService.registerUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
    }

    @PostMapping("//vacation/login")
    public ResponseEntity<User> loginUser(@RequestParam String email, @RequestParam String password) {
        User user = vacationService.loginUser(email, password);
        return ResponseEntity.ok(user);
    }

    @PostMapping("/vacation/properties")
    public ResponseEntity<Property> createProperty(@Valid  @RequestBody Property property) {
        Property createdProperty = vacationService.createProperty(property);
        return ResponseEntity.ok(createdProperty);
    }

    @GetMapping("/vacation /properties?location={location}&start_date={start_date}&end_date={end_date}")
    public ResponseEntity<List<Property>> searchProperties(@RequestParam String location,
                                                           @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
                                                           @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate) {
        List<Property> properties = vacationService.searchProperties(location, startDate, endDate);
        return ResponseEntity.ok(properties);
    }

    @PostMapping("/vacation/reservations")
    public ResponseEntity<Reservation> createReservation(@Valid  @RequestBody Reservation reservation) {
        Reservation createdReservation = vacationService.createReservation(reservation);
        return ResponseEntity.ok(createdReservation);
    }

    @GetMapping("/vacation/reservations?user_id={user_id}")
    public ResponseEntity<List<Reservation>> getReservationsByUserId(@RequestParam int user_id) {
        List<Reservation> reservations = vacationService.getReservationsByUserId(user_id);
        return ResponseEntity.ok(reservations);
    }

    @PostMapping("/vacation/reservations/{reservation_id}")
    public ResponseEntity<Void> cancelReservation(@PathVariable("reservation_id") int reservationId) {
        vacationService.cancelReservation(reservationId);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/vacation/properties/{property_id}")
    public ResponseEntity<Property> updateProperty(@PathVariable("property_id") int propertyId, @RequestBody Property property) {
        Property updatedProperty = vacationService.updateProperty(propertyId, property);
        return ResponseEntity.ok(updatedProperty);
    }
}
