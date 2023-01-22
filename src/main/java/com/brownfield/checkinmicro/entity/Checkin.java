package com.brownfield.checkinmicro.entity;

public class Checkin {

	private Integer checkinId;
	
	private Booking booking;
	
	private String emailId;
	
	//Seat Payment Details
	private Payment payment;
	
	private FlightBooking flightBooking;

	public Checkin() {
		super();
	}

	

	public Checkin(Integer checkinId, Booking booking, String emailId, Payment payment, FlightBooking flightBooking) {
		super();
		this.checkinId = checkinId;
		this.booking = booking;
		this.emailId = emailId;
		this.payment = payment;
		this.flightBooking = flightBooking;
	}



	public Integer getCheckinId() {
		return checkinId;
	}

	public void setCheckinId(Integer checkinId) {
		this.checkinId = checkinId;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}



	public FlightBooking getFlightBooking() {
		return flightBooking;
	}



	public void setFlightBooking(FlightBooking flightBooking) {
		this.flightBooking = flightBooking;
	}
	
	
}
