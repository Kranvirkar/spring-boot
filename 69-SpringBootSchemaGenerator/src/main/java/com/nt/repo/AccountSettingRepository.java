package com.nt.repo;

import org.springframework.data.repository.CrudRepository;

import com.nt.model.AccountSetting;

public interface AccountSettingRepository extends CrudRepository<AccountSetting, Long> {
    AccountSetting findByAccountId(Long accountId);
}