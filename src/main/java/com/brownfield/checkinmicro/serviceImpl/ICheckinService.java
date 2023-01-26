package com.brownfield.checkinmicro.serviceImpl;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.brownfield.checkinmicro.dto.CheckinDetailsDto;
import com.brownfield.checkinmicro.entity.Booking;
import com.brownfield.checkinmicro.entity.Checkin;
import com.brownfield.checkinmicro.entity.FlightBooking;
import com.brownfield.checkinmicro.entity.PnrRequest;
import com.brownfield.checkinmicro.service.CheckinService;

@Service
@EnableScheduling
public class ICheckinService implements CheckinService{

	String bookUrl = "http://ec2-13-232-62-130.ap-south-1.compute.amazonaws.com:9900";
//	String bookUrl = "http://localhost:9969";

	
	@Override
	public CheckinDetailsDto validatePnr(PnrRequest pnrRequest) {
		// TODO Auto-generated method stub
		
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<PnrRequest> request= new HttpEntity<>(pnrRequest); 
		CheckinDetailsDto checkinDetails = restTemplate
				.exchange(bookUrl + "/checkin/validatePnr", HttpMethod.POST, request, 
						new ParameterizedTypeReference<CheckinDetailsDto>() {
						}).getBody();
		return checkinDetails;
	}

	
	@Scheduled(fixedDelay = 60000)
	public void startCheckInFlights() {
		
		OffsetDateTime today = OffsetDateTime.now();
		
		//Get all bookings of flight that will depart after 1 day
		OffsetDateTime checkinDate = today.plusDays(1);
		
		System.out.println(checkinDate);
		
		RestTemplate restTemplate = new RestTemplate();
		List<Booking> allBookings = restTemplate
				.exchange(bookUrl + "/checkin/bookingInfoForScheduler/" + checkinDate, HttpMethod.POST, null, 
						new ParameterizedTypeReference<List<Booking>>() {
						}).getBody();
		
		List<Checkin> allCheckin = new ArrayList<>();
		
		allCheckin = restTemplate
				.exchange(bookUrl + "/checkin/getAllCheckIn", HttpMethod.GET, null, 
						new ParameterizedTypeReference<List<Checkin>>() {
						}).getBody();
		
		//System.out.println(allCheckin);
		
		Set<Integer> bookCheckInitalized = new HashSet<>();
		for(Checkin checkin : allCheckin) {
			bookCheckInitalized.add(checkin.getBooking().getBookingId());
		}
		
		List<Booking> remainingCheckInitalize = new ArrayList<>();
		
		//There are two things Check Initalized means transfer of booking data from book table to check table
		//Check successfull
		
		//Get a list of bookings whose data is not inserted in the checkIn table
		for(Booking booking : allBookings) {
			int bookId = booking.getBookingId();
			if(!bookCheckInitalized.contains(bookId)) {
				remainingCheckInitalize.add(booking);
			}
		}
		
		//System.out.println(remainingCheckInitalize);
		for(Booking booking : remainingCheckInitalize) {
			Checkin checkDetails = new Checkin();
			checkDetails.setBooking(booking);
			checkDetails.setEmailId(booking.getPassenger().get(0).getEmailId());
			
			FlightBooking flightBookedDetail =   restTemplate
					.exchange(bookUrl + "/book/getFlightByBookId/" + booking.getBookingId(), HttpMethod.GET, null, 
							new ParameterizedTypeReference<FlightBooking>() {
							}).getBody();
			
			checkDetails.setFlightBooking(flightBookedDetail);
			
			HttpHeaders headers = new HttpHeaders();
			// set `content-type` header
			headers.setContentType(MediaType.APPLICATION_JSON);
			// set `accept` header
			headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
			
			HttpEntity<Checkin> request = new HttpEntity<>(checkDetails, headers);
			
			String response = restTemplate
					.exchange(bookUrl + "/checkin/addCheckin", HttpMethod.POST, request, 
							new ParameterizedTypeReference<String>() {
							}).getBody();
		}
		
		
	}
}
