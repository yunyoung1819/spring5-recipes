package com.young.spring.court.service;

import com.young.spring.court.domain.Reservation;

import java.util.List;

public interface ReservationService {

    public List<Reservation> query(String courtName);
}
