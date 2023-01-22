package com.brownfield.checkinmicro.entity;

import java.util.Date;

public class Fare {

	private Integer fareId;
	///////
	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name="id" , nullable = false) private FlightBooking fb;
	 */
	/////////
	private int flightNo;
	private int bFare;
	private int eFare;
	private Date departure;
	public Fare() {
		super();
	}
	public Fare(Integer fareId, int flightNo, int bFare, int eFare, Date departure) {
		super();
		this.fareId = fareId;
		this.flightNo = flightNo;
		this.bFare = bFare;
		this.eFare = eFare;
		this.departure = departure;
	}
	public Integer getFareId() {
		return fareId;
	}
	public void setFareId(Integer fareId) {
		this.fareId = fareId;
	}
	public int getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(int flightNo) {
		this.flightNo = flightNo;
	}
	public int getbFare() {
		return bFare;
	}
	public void setbFare(int bFare) {
		this.bFare = bFare;
	}
	public int geteFare() {
		return eFare;
	}
	public void seteFare(int eFare) {
		this.eFare = eFare;
	}
	public Date getDeparture() {
		return departure;
	}
	public void setDeparture(Date departure) {
		this.departure = departure;
	}
	
	
}
