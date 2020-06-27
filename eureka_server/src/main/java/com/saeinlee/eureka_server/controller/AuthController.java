package com.saeinlee.eureka_server.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @GetMapping("/ping")
    public ResponseEntity<String> check() {
        return ResponseEntity.ok("pong");
    }
}