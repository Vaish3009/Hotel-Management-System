package com.hotelmanagementsystem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotelmanagementsystem.entity.Room;
import com.hotelmanagementsystem.service.RoomService;

@RestController
@RequestMapping("/api/rooms")
public class RoomController {
    @Autowired
    private RoomService roomService;

    @GetMapping
    public List<Room> getAllRooms() {
        return roomService.getAllRooms();
    }
    
    @PostMapping
    public String createRoom(@RequestBody Room room) {
         roomService.createRoom(room);
         return "Room added successfully";
    }

    @PutMapping("/{id}")
    public String updateRoom(@PathVariable Long id, @RequestBody Room roomDetails) {
         roomService.updateRoom(id, roomDetails);
         return "Updated room details successfully";
    }

    @DeleteMapping("/{id}")
    public String deleteRoom(@PathVariable Long id) {
        roomService.deleteRoom(id);
        return "Deleted room details successfully";
    }
    @GetMapping("/{id}")
    public Room getRoomById(@PathVariable Long id) {
    	 Room room=roomService.getRoomById(id);
    	 return room;
    }
}