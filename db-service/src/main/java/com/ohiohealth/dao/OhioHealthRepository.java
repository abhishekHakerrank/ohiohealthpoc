package com.ohiohealth.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ohiohealth.entity.Patient;

public interface OhioHealthRepository extends JpaRepository<Patient, Integer>{

	

}
