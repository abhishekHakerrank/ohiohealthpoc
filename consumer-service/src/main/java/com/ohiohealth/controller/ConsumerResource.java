package com.ohiohealth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ohiohealth.service.ConsumerDataService;

@RestController
@RequestMapping("/patient/data")
public class ConsumerResource {

	@Autowired
	ConsumerDataService patientService;
	
	
	 @GetMapping("/{patientId}")
	    public String getPateientData(@PathVariable final String patientId) {
		 
		 return  patientService.getPatientDatabyId(patientId);
		 
	 }

}
