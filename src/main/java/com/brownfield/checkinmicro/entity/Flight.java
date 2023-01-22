package com.brownfield.checkinmicro.entity;

import java.util.List;
import java.util.Set;

public class Flight {
	
	private Integer flightId;	
	private int flightNo;
	
	private int businessFare;
	private int economyFare;
	
	private Set<String> flightWeekDays;
	
	private Route route; 

	private List<FlightBooking> flightBooking;

	public Flight(Integer flightId, int flightNo, int businessFare, int economyFare, Set<String> flightWeekDays,
			Route route, List<FlightBooking> flightBooking) {
		super();
		this.flightId = flightId;
		this.flightNo = flightNo;
		this.businessFare = businessFare;
		this.economyFare = economyFare;
		this.flightWeekDays = flightWeekDays;
		this.route = route;
		this.flightBooking = flightBooking;
	}

	public Flight() {
		super();
	}

	public Integer getFlightId() {
		return flightId;
	}

	public void setFlightId(Integer flightId) {
		this.flightId = flightId;
	}

	public int getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(int flightNo) {
		this.flightNo = flightNo;
	}

	public int getBusinessFare() {
		return businessFare;
	}

	public void setBusinessFare(int businessFare) {
		this.businessFare = businessFare;
	}

	public int getEconomyFare() {
		return economyFare;
	}

	public void setEconomyFare(int economyFare) {
		this.economyFare = economyFare;
	}

	public Set<String> getFlightWeekDays() {
		return flightWeekDays;
	}

	public void setFlightWeekDays(Set<String> flightWeekDays) {
		this.flightWeekDays = flightWeekDays;
	}

	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}

	public List<FlightBooking> getFlightBooking() {
		return flightBooking;
	}

	public void setFlightBooking(List<FlightBooking> flightBooking) {
		this.flightBooking = flightBooking;
	}
	
	

}
