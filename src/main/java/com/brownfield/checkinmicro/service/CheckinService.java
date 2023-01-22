package com.brownfield.checkinmicro.service;

import org.springframework.stereotype.Service;

import com.brownfield.checkinmicro.dto.CheckinDetailsDto;
import com.brownfield.checkinmicro.entity.PnrRequest;

@Service
public interface CheckinService {

	public CheckinDetailsDto validatePnr(PnrRequest pnrRequest);
}
