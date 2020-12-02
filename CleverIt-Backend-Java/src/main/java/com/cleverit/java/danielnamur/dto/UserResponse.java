package com.cleverit.java.danielnamur.dto;

import java.util.List;

import lombok.Data;

@Data
public class UserResponse {

	private List<UserDTO> userList;
}
