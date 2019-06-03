package com.ohiohealth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class PractitionerDataService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	public String getPractitionerServiceDatabyId(String practitionerServiceId) {
		
		
		return restTemplate.getForObject("https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Practitioner/"+practitionerServiceId, String.class);
		
	}

}
