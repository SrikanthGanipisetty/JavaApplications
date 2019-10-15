package com.bharath.flightcheckin.integration;

import com.bharath.flightcheckin.integration.dto.Reservation;
import com.bharath.flightcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {

	public Reservation findReservation(Long id);

	public Reservation updateReservation(ReservationUpdateRequest request);

}
