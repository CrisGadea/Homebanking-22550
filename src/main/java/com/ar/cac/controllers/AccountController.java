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

import com.ar.cac.Models.Account;
import com.ar.cac.services.AccountService;

@RestController
public class AccountController {

	private AccountService service;
	
	public AccountController (AccountService service) {
		this.service = service;
	}
	
	@GetMapping("/api/account/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public Optional<Account> byId(@PathVariable("id") int id) {
	    return service.find(id);
	}
	
	@GetMapping("/api/account")
	@ResponseStatus(code = HttpStatus.OK)
	public List<Account> getUsers(){
		return (List<Account>) service.findAll();
	}
	
	@PostMapping("/api/account")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Account create(@RequestBody Account account) {
	    return service.create(account);
	}
	
	@PutMapping("/api/account")
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	public Account update(@RequestBody Account account) {
	    return service.update(account);
	}
	
	@PatchMapping("/api/account")
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	public Account change(@RequestBody Account account) {
	    return service.change(account);
	}
	
	@DeleteMapping("/api/account/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public Boolean delete(@PathVariable("id") int id) {
	    return service.remove(id);
	}
	
	
}
