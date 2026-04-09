package com.sbp;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class MyController {

    private final WebClient wc;

    @Value("${basicrest.get.endpoint.getStudent}")
    String url;

    public MyController(WebClient wc) {
        this.wc = wc;
    }

    @GetMapping("/getStud")
    public Mono<Student> getStudent() {
        return wc.get()
                 .uri(url)  // e.g. http://localhost:8080/getStudent
                 .retrieve()
                 .bodyToMono(Student.class);
    }

    @GetMapping("/test")
    public String test() {
        return new String("testing webclient");
    }
    
}

