package com.cleverit.java.danielnamur.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cleverit.java.danielnamur.dto.UserDTO;
import com.cleverit.java.danielnamur.repositories.LicensePlateRepository;

public class ApiServiceImpl implements ApiService {

	private static String URL_USER = "http://arsene.azurewebsites.net/User/";
	private static String URL_LICENSE_PLATE = "https://arsene.azurewebsites.net/LicensePlate/";
	
	@Autowired
	LicensePlateRepository licensePlateRepository;
	
	
	@Override
	public Boolean fetchDataLicensePlate() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDTO getUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDTO> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDTO createUser(UserDTO user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDTO updateUser(UserDTO user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
