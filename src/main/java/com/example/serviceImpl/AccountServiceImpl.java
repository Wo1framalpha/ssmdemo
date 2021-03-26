package com.example.serviceImpl;

import com.example.domain.Account;
import com.example.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: ssmtest1
 * @description: AS Impl
 * @author: Bob
 * @create: 2021-03-23 11:16
 **/
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Override
    public List<Account> findAll() {
        System.out.println("业务层查询所有账户成功");
        return null;
    }

    @Override
    public void addAccount(Account account) {
        System.out.println("业务曾新建账户成功");
    }
}
