package com.brownfield.checkinmicro.dto;

import java.util.Set;

import com.brownfield.checkinmicro.entity.Booking;
import com.brownfield.checkinmicro.entity.Checkin;
import com.brownfield.checkinmicro.entity.Flight;
import com.brownfield.checkinmicro.entity.FlightBooking;

public class CheckinDetailsDto {

	private FlightBooking flightBooking;
	
	private Booking bookingDetails;
	
	private Set<String> seatsEconomyBooked; 
	
	private Set<String> seatsBussinessBooked;
	
	private Checkin checkInDetails;
	
	private Flight flight;

	

	public CheckinDetailsDto(FlightBooking flightBooking, Booking bookingDetails, Set<String> seatsEconomyBooked,
			Set<String> seatsBussinessBooked, Checkin checkInDetails, Flight flight) {
		super();
		this.flightBooking = flightBooking;
		this.bookingDetails = bookingDetails;
		this.seatsEconomyBooked = seatsEconomyBooked;
		this.seatsBussinessBooked = seatsBussinessBooked;
		this.checkInDetails = checkInDetails;
		this.flight = flight;
	}

	public CheckinDetailsDto() {
		super();
	}

	public FlightBooking getFlightBooking() {
		return flightBooking;
	}

	public void setFlightBooking(FlightBooking flightBooking) {
		this.flightBooking = flightBooking;
	}

	public Booking getBookingDetails() {
		return bookingDetails;
	}

	public void setBookingDetails(Booking bookingDetails) {
		this.bookingDetails = bookingDetails;
	}

	public Set<String> getSeatsEconomyBooked() {
		return seatsEconomyBooked;
	}

	public void setSeatsEconomyBooked(Set<String> seatsEconomyBooked) {
		this.seatsEconomyBooked = seatsEconomyBooked;
	}

	public Set<String> getSeatsBussinessBooked() {
		return seatsBussinessBooked;
	}

	public void setSeatsBussinessBooked(Set<String> seatsBussinessBooked) {
		this.seatsBussinessBooked = seatsBussinessBooked;
	}

	public Checkin getCheckInDetails() {
		return checkInDetails;
	}

	public void setCheckInDetails(Checkin checkInDetails) {
		this.checkInDetails = checkInDetails;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	
	
	
	
}
