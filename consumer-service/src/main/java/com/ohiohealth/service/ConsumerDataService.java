package com.ohiohealth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class ConsumerDataService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	public String getPatientDatabyId(String patientId) {
		
		
		return restTemplate.getForObject("http://patient-info-service/patient/data/"+patientId, String.class);
		
	}

}
