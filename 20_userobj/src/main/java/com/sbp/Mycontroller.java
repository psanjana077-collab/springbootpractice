package com.sbp;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Mycontroller {
  @GetMapping("/get")
  public String getMethodName() {
      return "get invoked";
  }
  
}
