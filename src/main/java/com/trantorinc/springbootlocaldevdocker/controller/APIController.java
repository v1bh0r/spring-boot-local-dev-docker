package com.trantorinc.springbootlocaldevdocker.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class APIController {
    @GetMapping("/")
    private ResponseEntity<String> getRoot() {
        return ResponseEntity.ok("Hello Human");
    }
}