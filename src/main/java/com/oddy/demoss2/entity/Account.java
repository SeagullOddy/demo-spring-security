package com.oddy.demoss2.entity;

import lombok.Data;

// 1.2.3 自定义认证 实体类
@Data
public class Account {

  private Integer id;

  private String username;

  private String password;

  private String email;

}
