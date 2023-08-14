package com.oddy.demoss2.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class MainController {

  // 1.2.2 基于数据库的认证
//  @Resource
//  private UserDetailsManager userDetailsManager;
//  @Resource
//  private PasswordEncoder passwordEncoder;

  @GetMapping("/")
  public String index() {
    return "index";
  }

  @GetMapping("/login")
  public String login() {
    return "login";
  }

//  @PostMapping("/pay")
//  @ResponseBody
//  public String pay(@RequestParam("target") String target) {
//    JSONObject json = new JSONObject();
//    log.info("支付成功，支付目标：{}", target);
//    json.put("code", 0);
//    json.put("msg", "支付成功");
//    json.put("data", target);
//    return json.toJSONString();
//  }

  // 1.2.2 基于数据库的认证
  // 使用 UserDetailsManager，可以快速执行用户相关的管理操作，如修改密码
//  @PostMapping("/change-password")
//  @ResponseBody
//  public String changePassword(@RequestParam String oldPassword, @RequestParam String newPassword) {
//    userDetailsManager.changePassword(oldPassword, passwordEncoder.encode(newPassword));
//    JSONObject json = new JSONObject();
//    log.info("修改密码，旧密码：{}，新密码：{}", oldPassword, newPassword);
//    json.put("code", 0);
//    json.put("msg", "修改密码成功");
//    json.put("data", newPassword);
//    return json.toJSONString();
//  }

}
