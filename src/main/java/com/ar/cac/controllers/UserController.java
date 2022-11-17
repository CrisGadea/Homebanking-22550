package com.ar.cac.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
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
	@ResponseStatus(code = HttpStatus.OK)
	public Optional<User> byId(@PathVariable("id") int id) {
	    return userService.find(id);
	}
	
	@GetMapping("/api/user")
	@ResponseStatus(code = HttpStatus.OK)
	public List<User> getUsers(){
		return (List<User>) userService.findAll();
	}
	
	@PostMapping("/api/user")
	@ResponseStatus(code = HttpStatus.CREATED)
	public User create(@RequestBody User user) {
	    return userService.create(user);
	}
	
	@PutMapping("/api/user/")
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	public User update(@RequestBody User user) {
	    return userService.update(user);
	}
	
	@PatchMapping("/api/user/")
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	public User change(@RequestBody User user) {
	    return userService.change(user);
	}
	
	@DeleteMapping("/api/user/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public Boolean delete(@PathVariable("id") int id) {
	    return userService.remove(id);
	}
}
