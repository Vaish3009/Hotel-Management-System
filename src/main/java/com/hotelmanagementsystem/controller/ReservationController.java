package com.hotelmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotelmanagementsystem.entity.Reservation;
import com.hotelmanagementsystem.service.ReservationService;

@RestController
@RequestMapping("/api/reservations")
public class ReservationController {
    @Autowired
    private ReservationService reservationService;

    @GetMapping
    public List<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }

    @PostMapping
    public String createReservation(@RequestBody Reservation reservation) {
         reservationService.createReservation(reservation);
         return "Reservation done successfully";
    }

    @PutMapping("/{id}")
    public String updateReservation(@PathVariable Long id, @RequestBody Reservation reservationDetails) {
         reservationService.updateReservation(id, reservationDetails);
         return "Reservation updated successfully";
    }

    @DeleteMapping("/{id}")
    public String deleteReservation(@PathVariable Long id) {
        reservationService.deleteReservation(id);
        return "Reservation deleted successfully";
    }
    @GetMapping("/{id}")
    public Reservation getReservationById(@PathVariable Long id) {
    	Reservation reservation=reservationService.getReservationById(id);
    	return reservation;
    }
}
