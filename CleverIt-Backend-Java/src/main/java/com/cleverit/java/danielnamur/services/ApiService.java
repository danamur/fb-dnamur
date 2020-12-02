package com.cleverit.java.danielnamur.services;

import java.util.List;

import com.cleverit.java.danielnamur.dto.UserDTO;
import com.cleverit.java.danielnamur.models.LicensePlate;

public interface ApiService {

	public List<LicensePlate> getDataLicensePlate();
	
	public UserDTO getUserById(String id);
	
	public List<UserDTO> getAllUsers();
	
	public UserDTO createUser(UserDTO user);
	
	public UserDTO updateUser(UserDTO user);
	
	public Boolean deleteUser(String id);

}
