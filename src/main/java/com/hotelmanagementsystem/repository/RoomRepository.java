package com.hotelmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotelmanagementsystem.entity.Room;
@Repository
public interface RoomRepository extends JpaRepository<Room, Long>{

}
