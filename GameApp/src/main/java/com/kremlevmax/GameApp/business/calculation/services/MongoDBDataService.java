package com.kremlevmax.GameApp.business.calculation.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;

@Repository
@Qualifier("MongoDB")
public class MongoDBDataService implements DataServices {

	@Override
	public int[] retrieveData() {
		return new int[] {11, 22, 33, 44, 55};
	}
	
	@PostConstruct
	public void connectionMessage() {
		System.out.println("Connection to MongoDB enabled");
	}

}
