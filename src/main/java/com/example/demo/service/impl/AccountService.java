package com.example.demo.service.impl;

import com.example.demo.model.Account;
import com.example.demo.repository.AccountRespository;
import com.example.demo.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService implements IAccountService {
       @Autowired
       private AccountRespository accountRespository ;

    @Override
    public List<Account> findAll() {
        return null;
    }

    @Override
    public Account findById(Long id) {
        return null;
    }

    @Override
    public void save(Account account) {
           accountRespository.save(account);
    }

    @Override
    public void remove(Long id) {
          accountRespository.delete(findById(id));
    }
}
