package com.oddy.demoss2.service.impl;

import com.oddy.demoss2.entity.Account;
import com.oddy.demoss2.mapper.AccountMapper;
import jakarta.annotation.Resource;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

// 1.2.3 自定义认证（基于数据库，也可以基于本地文件等，随心所欲）
// 通过实现 UserDetailsService/UserDetailsManager 接口来实现自定义的用户认证
@Service
public class AccountUserDetailsService implements UserDetailsService {

  @Resource
  private AccountMapper accountMapper;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    Account account = accountMapper.selectByUsername(username);
    if (account == null) {
      throw new UsernameNotFoundException("用户名或密码错误");
    }
    return User.withUsername(account.getUsername())
        .password(account.getPassword())
        .roles("USER")
        .build();
  }

}
