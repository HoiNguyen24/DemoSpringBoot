package com.example.demo.repository;

import com.example.demo.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


public interface AccountRespository extends JpaRepository<Account,Long> {
    Account findAccountById(Long id);

}
