package com.brownfield.checkinmicro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brownfield.checkinmicro.dto.CheckinDetailsDto;
import com.brownfield.checkinmicro.entity.PnrRequest;
import com.brownfield.checkinmicro.service.CheckinService;

@RestController
@RequestMapping("/checkin")
@CrossOrigin
public class CheckinController {
	
	
	@Autowired
	CheckinService checkinService;
	
	@PostMapping("/validatePnr")
	public CheckinDetailsDto validatePnr(@RequestBody PnrRequest pnrRequest) {
		
		CheckinDetailsDto checkinInfo = checkinService.validatePnr(pnrRequest);
		return checkinInfo;
	}
	
	
	
	
}
