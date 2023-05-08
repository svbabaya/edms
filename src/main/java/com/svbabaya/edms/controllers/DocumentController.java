package com.svbabaya.edms.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DocumentController {
    @GetMapping("/")
    public String start() {
        return "hi spring";
    }
}
