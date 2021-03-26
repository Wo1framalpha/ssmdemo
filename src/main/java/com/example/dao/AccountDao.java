package com.example.dao;

import com.example.domain.Account;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AccountDao {
    /**
     * 查询账户
     * @return
     */
    @Select("SELECT * FROM account")
    public List<Account> findAll();

    /**
     * 添加账户Dao
     * @param account
     */
    @Select("INSERT INTO account (name, balance) VALUES (#{name}, #{balance})")
    public void addAccount(Account account);
}
