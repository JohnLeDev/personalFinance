package com.lean.moneynote.User.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lean.moneynote.User.dto.UserDTO;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
	@GetMapping("/welcome")
	public String welcome() {
		return "Your welcome";
	}
	
	@PostMapping("/insert")
	public ResponseEntity<UserDTO> insertUser(@RequestBody UserDTO userDTO){
		return
	}
}
