package com.kremlevmax.GameApp.business.calculation.services;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;

@Repository
@Primary
@Lazy
public class MySQLDataService implements DataServices {

	@Override
	public int[] retrieveData() {
		return new int[] {1, 2, 3, 4, 5};
	}
	
	@PostConstruct
	public void connectionMessage() {
		System.out.println("Connection to MySQL enabled");
	}

}
