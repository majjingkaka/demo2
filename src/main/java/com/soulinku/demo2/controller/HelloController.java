package com.soulinku.demo2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.soulinku.demo2.service.MainService;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
public class HelloController {

    @Autowired
	MainService mainService;

    





    @GetMapping("/hello")
    public String hello() {
        return "Hello, Spring Boot in VS Code!";
    }

    @GetMapping("/hello2")
    @ResponseBody
    public ResponseEntity<String> hello2() {
        log.info("HelloController hello2 call...");


        String data = "{\"message\": \"Hello World!\"}";

        mainService.selectMainAll();

        return ResponseEntity.ok(data);
    }
}