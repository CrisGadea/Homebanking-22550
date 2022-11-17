package com.ar.cac.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ar.cac.Models.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account,Long> {

}
