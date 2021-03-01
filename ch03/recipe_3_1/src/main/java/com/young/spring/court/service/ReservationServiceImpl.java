package com.young.spring.court.service;

import com.young.spring.court.domain.Player;
import com.young.spring.court.domain.Reservation;
import com.young.spring.court.domain.SportType;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class ReservationServiceImpl implements ReservationService {

    public static final SportType TENNIS = new SportType(1, "Tennis");
    public static final SportType BASEBALL = new SportType(2, "BaseBall");

    private final List<Reservation> reservations = new ArrayList<>();

    public ReservationServiceImpl() {
        reservations.add(new Reservation("Tennis #1", LocalDate.of(2021, 3, 1), 16,
                new Player("YUN YOUNG", "N/A"), TENNIS));
        reservations.add(new Reservation("Tennis #2", LocalDate.of(2021, 3, 1), 18,
                new Player("LeeJumi", "N/A"), TENNIS));
    }

    @Override
    public List<Reservation> query(String courtName) {

        return this.reservations.stream()
                .filter(reservation -> Objects.equals(reservation.getCourtName(), courtName))
                .collect(Collectors.toList());
    }
}
