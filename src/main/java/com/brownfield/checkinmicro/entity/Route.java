package com.brownfield.checkinmicro.entity;

import java.time.OffsetTime;

public class Route {

private Integer routeId;

	private Flight flight;
	
	private String departureAirport;
	
	private String arrivalAirport;
	
	private OffsetTime departureTime;
	
	private OffsetTime arrivalTime;
	
	
	private long totalDistance;


	public Route(Integer routeId, Flight flight, String departureAirport, String arrivalAirport,
			OffsetTime departureTime, OffsetTime arrivalTime, long totalDistance) {
		super();
		this.routeId = routeId;
		this.flight = flight;
		this.departureAirport = departureAirport;
		this.arrivalAirport = arrivalAirport;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.totalDistance = totalDistance;
	}


	public Route() {
		super();
	}


	public Integer getRouteId() {
		return routeId;
	}


	public void setRouteId(Integer routeId) {
		this.routeId = routeId;
	}


	public Flight getFlight() {
		return flight;
	}


	public void setFlight(Flight flight) {
		this.flight = flight;
	}


	public String getDepartureAirport() {
		return departureAirport;
	}


	public void setDepartureAirport(String departureAirport) {
		this.departureAirport = departureAirport;
	}


	public String getArrivalAirport() {
		return arrivalAirport;
	}


	public void setArrivalAirport(String arrivalAirport) {
		this.arrivalAirport = arrivalAirport;
	}


	public OffsetTime getDepartureTime() {
		return departureTime;
	}


	public void setDepartureTime(OffsetTime departureTime) {
		this.departureTime = departureTime;
	}


	public OffsetTime getArrivalTime() {
		return arrivalTime;
	}


	public void setArrivalTime(OffsetTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}


	public long getTotalDistance() {
		return totalDistance;
	}


	public void setTotalDistance(long totalDistance) {
		this.totalDistance = totalDistance;
	}
	
	
}
