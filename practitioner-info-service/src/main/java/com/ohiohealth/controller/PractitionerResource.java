package com.ohiohealth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ohiohealth.service.PractitionerDataService;

@RestController
@RequestMapping("/practitioner/data")
public class PractitionerResource {

	@Autowired
	PractitionerDataService practitionerService;
	
	
	 @GetMapping("/{practitionerId}")
	    public String getPractitionerData(@PathVariable final String practitionerId) {
		 
		 return  practitionerService.getPractitionerServiceDatabyId(practitionerId);
		 
	 }

}
