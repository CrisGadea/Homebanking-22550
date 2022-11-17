package com.ar.cac.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ar.cac.Models.Account;
import com.ar.cac.repositories.AccountRepository;

@Service
public class AccountService {

	private AccountRepository repo;
	
	public AccountService(AccountRepository repo) {
		this.repo = repo;
	}
	
	
	public Account create(Account user) {
        return repo.save(user);
    }

    public Account update(Account user) {
        return repo.save(user);
    }

    public Account change(Account user) {
        return repo.save(user);
    }

    public boolean remove(long id) {
        if (repo.existsById(id)) {
        	repo.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    public Optional<Account> find(long id) {
        return repo.findById(id);
    }
    
    public Iterable<Account> findAll(){
    	return repo.findAll();
    }
}
