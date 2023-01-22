package com.brownfield.checkinmicro.entity;

import java.time.LocalDateTime;
import java.util.List;

public class Booking {

	private Integer bookingId;	
	
	private String pnrNo;
	
	private LocalDateTime bookingDate;
	
	//Either business or economy
	private String seatClass;
	
	private FlightBooking flightBooking;
	
	private Payment payment;
	
	private List<Passenger> passenger;

	public Booking() {
		super();
	}

	

	public Booking(Integer bookingId, String pnrNo, LocalDateTime bookingDate, String seatClass,
			FlightBooking flightBooking, Payment payment, List<Passenger> passenger) {
		super();
		this.bookingId = bookingId;
		this.pnrNo = pnrNo;
		this.bookingDate = bookingDate;
		this.seatClass = seatClass;
		this.flightBooking = flightBooking;
		this.payment = payment;
		this.passenger = passenger;
	}



	public Integer getBookingId() {
		return bookingId;
	}

	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}

	public String getPnrNo() {
		return pnrNo;
	}

	public void setPnrNo(String pnrNo) {
		this.pnrNo = pnrNo;
	}

	public LocalDateTime getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDateTime bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getSeatClass() {
		return seatClass;
	}

	public void setSeatClass(String seatClass) {
		this.seatClass = seatClass;
	}

	public FlightBooking getFlightBooking() {
		return flightBooking;
	}

	public void setFlightBooking(FlightBooking flightBooking) {
		this.flightBooking = flightBooking;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}



	public List<Passenger> getPassenger() {
		return passenger;
	}



	public void setPassenger(List<Passenger> passenger) {
		this.passenger = passenger;
	}
	
	
	

}
