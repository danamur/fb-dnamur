package com.cleverit.java.danielnamur.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cleverit.java.danielnamur.models.LicensePlate;
import com.cleverit.java.danielnamur.models.LicenseResponse;
import com.cleverit.java.danielnamur.services.ApiService;

@RestController
@RequestMapping("/api/license")
@CrossOrigin(origins = "*")
public class LicenseController {

	@Autowired
	private ApiService apiService;
	
	private LicenseController(ApiService apiService) {
		this.apiService = apiService;
	}
	
	@GetMapping("/")
	public @ResponseBody LicenseResponse getLicensePlate() {
		LicenseResponse licenseResponse = new LicenseResponse();
		try {
			List<LicensePlate> licenseList = apiService.getDataLicensePlate();
			licenseResponse.setLicenseList(licenseList);
		} catch (Exception e) {
			System.out.println("[LicenseController-getLicensePlate] Error en el metodo");
		}
		return licenseResponse;
		
	}
	
}
