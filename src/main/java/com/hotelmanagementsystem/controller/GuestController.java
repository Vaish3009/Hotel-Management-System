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

import com.hotelmanagementsystem.entity.Guest;
import com.hotelmanagementsystem.repository.GuestRepository;
import com.hotelmanagementsystem.service.GuestService;

@RestController
@RequestMapping("/api/guests")
public class GuestController {
    @Autowired
    private GuestService guestService;

    @GetMapping
    public List<Guest> getAllGuests() {
        return guestService.getAllGuests();
    }

    @PostMapping
    public String createGuest(@RequestBody Guest guest) {
         guestService.createGuest(guest);
         return "Created guest data successfully";
    }

    @PutMapping("/{id}")
    public String updateGuest(@PathVariable Long id, @RequestBody Guest guestDetails) {
         guestService.updateGuest(id, guestDetails);
         return "Updated guest data successfully";
    }

    @DeleteMapping("/{id}")
    public String deleteGuest(@PathVariable Long id) {
        guestService.deleteGuest(id);
        return "Deleted guest data successfully";
    }
    @GetMapping("/{id}")
    public Guest getGuestById(@PathVariable Long id) {
    	 Guest guest=guestService.getGuestById(id);
    	 return guest;
 


    }
}
