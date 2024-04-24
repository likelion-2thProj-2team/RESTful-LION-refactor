package com.hppystay.hotelreservation.hotel.repository;

import com.hppystay.hotelreservation.hotel.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    @Query("SELECT DISTINCT r.room.id FROM Reservation r " +
            "WHERE r.checkIn < :checkOut AND r.checkOut > :checkIn")
    List<Long> findUnavailableRoomIds(LocalDate checkIn, LocalDate checkOut);
}
