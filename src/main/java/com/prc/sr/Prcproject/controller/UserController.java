package com.prc.sr.Prcproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prc.sr.Prcproject.Service.UserService;
import com.prc.sr.Prcproject.dto.User;

import jakarta.websocket.server.PathParam;



@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	UserService service;     

	@PostMapping
	public User saveUser(@RequestBody User user) {
		return service.saveUser(user);	
	}

	@PutMapping
	public User updateUser(@RequestParam int id,@RequestBody User user) {
		return service.udateUser(id, user);
	}
	
	@GetMapping
	public User getUserByID(@RequestParam int id) {
		return service.getUser(id);
	}
	
	@DeleteMapping
	public String deleteUser(@RequestParam int id) {
		return service.deleteUser(id);
	}
}
