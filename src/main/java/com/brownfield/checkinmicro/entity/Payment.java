package com.brownfield.checkinmicro.entity;

import java.time.LocalDateTime;

public class Payment {

	private Integer paymentNo;
	
	private String paymentId;
	
	private String paymentOrderId;
	
	private String razorpaySignature;
	
	private String paymentStatus;
	
	private LocalDateTime paymentDate;
	
	private Integer amount;

	public Payment() {
		super();
	}

	public Payment(Integer paymentNo, String paymentId, String paymentOrderId, String razorpaySignature,
			String paymentStatus, LocalDateTime paymentDate, Integer amount) {
		super();
		this.paymentNo = paymentNo;
		this.paymentId = paymentId;
		this.paymentOrderId = paymentOrderId;
		this.razorpaySignature = razorpaySignature;
		this.paymentStatus = paymentStatus;
		this.paymentDate = paymentDate;
		this.amount = amount;
	}

	public Integer getPaymentNo() {
		return paymentNo;
	}

	public void setPaymentNo(Integer paymentNo) {
		this.paymentNo = paymentNo;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public String getPaymentOrderId() {
		return paymentOrderId;
	}

	public void setPaymentOrderId(String paymentOrderId) {
		this.paymentOrderId = paymentOrderId;
	}

	public String getRazorpaySignature() {
		return razorpaySignature;
	}

	public void setRazorpaySignature(String razorpaySignature) {
		this.razorpaySignature = razorpaySignature;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public LocalDateTime getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDateTime paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
	
}
