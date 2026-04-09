package com.sbp;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class MyController {
@GetMapping("/get")
public String getMethodName() {
    return new String("get is invoked via security");
}

}
