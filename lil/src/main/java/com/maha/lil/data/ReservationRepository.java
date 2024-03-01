package com.maha.lil.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    Iterable<Reservation> findReservationByReservationDate(Date date);
}
