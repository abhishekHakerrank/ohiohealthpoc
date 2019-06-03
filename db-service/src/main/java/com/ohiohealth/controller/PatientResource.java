package com.ohiohealth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ohiohealth.dao.OhioHealthRepository;

@RestController
public class PatientResource {
	
	@Autowired
	private OhioHealthRepository ohRepo;
	
	@GetMapping("/patient/data/{patientId}")
	public String getPatientDataById(@PathVariable String patientId) {
		
		
		return "Patient Data";
	}
	

}
