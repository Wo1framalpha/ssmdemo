package com.example.service;

import com.example.domain.Account;

import java.util.List;

/**
 *
 */
public interface AccountService {
    /**
     * 查询所有账户
     * @return
     */
    List<Account> findAll();

    /**
     * 添加账户
     * @param account
     */
    void addAccount(Account account);
}
