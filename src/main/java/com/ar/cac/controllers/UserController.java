package com.ar.cac.controllers;

import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ar.cac.Models.User;
import com.ar.cac.services.UserService;

@RestController
public class UserController {
	
	private final UserService userService;
	
	public UserController(UserService userService) {
	    this.userService = userService;
	}
	
	@GetMapping("/api/user/{id}")
	public Optional<User> byId(@PathVariable("id") int id) {
	    return userService.find(id);
	}
	
	@PostMapping("/api/user/")
	public User create(@RequestBody User user) {
	    return userService.create(user);
	}
	
	@PutMapping("/api/user/")
	public User update(@RequestBody User user) {
	    return userService.update(user);
	}
	
	@PatchMapping("/api/user/")
	public User change(@RequestBody User user) {
	    return userService.change(user);
	}
	
	@DeleteMapping("/api/user/{id}")
	public boolean delete(@PathVariable("id") int id) {
	    return userService.remove(id);
	}
}
