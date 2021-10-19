package cn.someget.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试的api接口
 *
 * @author zyf
 * @date 2021-10-19 21:10
 */
@RestController
@RequestMapping("/api-service")
public class DemoController {

  @GetMapping("/hello")
  public String judgeOk() {
    return "ok";
  }

}
