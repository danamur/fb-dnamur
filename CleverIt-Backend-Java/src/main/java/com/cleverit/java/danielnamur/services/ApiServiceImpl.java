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
	public UserDTO getUserById(String id) {
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
		
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.postForObject(URL_USER, user, UserDTO.class);
		return user;
	}

	@Override
	public UserDTO updateUser(UserDTO user) {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.put(URL_USER + user.getId(), user);
		return user;
	}

	@Override
	public Boolean deleteUser(String id) {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.delete(URL_USER + id);
		return true;
	}

}
