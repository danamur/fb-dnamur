package com.cleverit.java.danielnamur.services;

import java.util.List;

import com.cleverit.java.danielnamur.dto.UserDTO;

public interface ApiService {

	public Boolean fetchDataLicensePlate() throws Exception;
	
	public UserDTO getUserById(String id);
	
	public List<UserDTO> getAllUsers();
	
	public UserDTO createUser(UserDTO user);
	
	public UserDTO updateUser(UserDTO user);
	
	public Boolean deleteUser(String id);

}
