package com.kremlevmax.GameApp.business.calculation.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class BusinessCalculationServices {
	@Autowired
	@Qualifier("MongoDB")
	DataServices dataServices;
	
	
	public int findMax() {
		return Arrays.stream(dataServices.retrieveData()).max().orElse(0);
	}
}
