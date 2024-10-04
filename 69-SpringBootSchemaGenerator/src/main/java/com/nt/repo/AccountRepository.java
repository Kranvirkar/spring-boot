package com.nt.repo;

import org.springframework.data.repository.CrudRepository;

import com.nt.model.Account;

public interface AccountRepository extends CrudRepository<Account, Long> {
	Account findByName(String name);
}