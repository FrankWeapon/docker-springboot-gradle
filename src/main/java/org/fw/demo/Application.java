package org.fw.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * File created by FrankWeapon on 24/05/2017 for spring-boot-gradle.
 * Email: helldarkfire@gmail.com
 */
@SpringBootApplication
@RestController
public class Application {
  @RequestMapping("/")
  public String index(){
    return "Hello World";
  }

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
