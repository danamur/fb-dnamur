package com.cleverit.java.danielnamur.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cleverit.java.danielnamur.dto.UserDTO;
import com.cleverit.java.danielnamur.repositories.LicensePlateRepository;

@Service
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
		RestTemplate restTemplate = new RestTemplate();
		UserDTO user = restTemplate.getForObject(URL_USER + id, UserDTO.class);
		return user;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<UserDTO> getAllUsers() {
		RestTemplate restTemplate = new RestTemplate();
		Object user = restTemplate.getForObject(URL_USER, Object.class);
		return (List<UserDTO>) user;
	}

	@Override
	public UserDTO createUser(UserDTO user) {
		return null;
	}

	@Override
	public UserDTO updateUser(UserDTO user) {
		return null;
	}

	@Override
	public Boolean deleteUser(int id) {
		return null;
	}

}
