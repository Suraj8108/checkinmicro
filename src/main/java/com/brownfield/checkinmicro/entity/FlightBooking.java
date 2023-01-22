package com.brownfield.checkinmicro.entity;

import java.time.OffsetDateTime;
import java.util.Set;

public class FlightBooking {

	private Integer id;
	
	private OffsetDateTime departureDateTime;
	
	private OffsetDateTime arrivalDateTime;
	
	private long totalTime;
	
	private Flight flight;

	private Set<Booking> booking;
	
	private Set<Checkin> checkIn;
	///////
	private Fare fare;
	public FlightBooking() {
		super();
	}
	
	public FlightBooking(Integer id, OffsetDateTime departureDateTime, OffsetDateTime arrivalDateTime, long totalTime,
			Flight flight, Set<Booking> booking, Set<Checkin> checkIn, Fare fare) {
		super();
		this.id = id;
		this.departureDateTime = departureDateTime;
		this.arrivalDateTime = arrivalDateTime;
		this.totalTime = totalTime;
		this.flight = flight;
		this.booking = booking;
		this.checkIn = checkIn;
		this.fare = fare;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public OffsetDateTime getDepartureDateTime() {
		return departureDateTime;
	}
	public void setDepartureDateTime(OffsetDateTime departureDateTime) {
		this.departureDateTime = departureDateTime;
	}
	public OffsetDateTime getArrivalDateTime() {
		return arrivalDateTime;
	}
	public void setArrivalDateTime(OffsetDateTime arrivalDateTime) {
		this.arrivalDateTime = arrivalDateTime;
	}
	public long getTotalTime() {
		return totalTime;
	}
	public void setTotalTime(long totalTime) {
		this.totalTime = totalTime;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	public Set<Booking> getBooking() {
		return booking;
	}
	public void setBooking(Set<Booking> booking) {
		this.booking = booking;
	}
	public Fare getFare() {
		return fare;
	}
	public void setFare(Fare fare) {
		this.fare = fare;
	}

	public Set<Checkin> getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(Set<Checkin> checkIn) {
		this.checkIn = checkIn;
	}
	
	
	
	
}
