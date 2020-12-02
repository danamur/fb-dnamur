package com.cleverit.java.danielnamur.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cleverit.java.danielnamur.dto.UserDTO;
import com.cleverit.java.danielnamur.dto.UserResponse;
import com.cleverit.java.danielnamur.services.ApiService;


@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins = "*")
public class UserController {
	
	@Autowired
	private ApiService apiService;
	
	private UserController(ApiService apiService) {
		this.apiService = apiService;
	}
	
	@GetMapping("/{id}")
	public @ResponseBody UserDTO getUserById(@PathVariable("id") int id) {
		UserDTO response = null;
		try {
			response = apiService.getUserById(id);
		} catch (Exception e) {
			System.out.println("[UserController][getUserById] Error en el Metodo");
		}
		
		return response;
	}
	
	@GetMapping("/all")
	public @ResponseBody UserResponse getAllUsers() {
		UserResponse userResponse = new UserResponse();
		try {
			List<UserDTO> userList = apiService.getAllUsers();
			userResponse.setUserList(userList);
		} catch(Exception e) {
			System.out.println("[UserController][getAllUsers] Error en el Metodo");
		}
		
		return userResponse;
	} 
}
