package com.svbabaya.edms.controllers;

import com.svbabaya.edms.models.Document;
import com.svbabaya.edms.services.DocsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/docs")
public class DocsController {

    private final DocsService docsService;

    @Autowired
    public DocsController(DocsService docsService) {
        this.docsService = docsService;
    }


    @GetMapping("/all")
    public List<Document> getAllDocs() {

        return docsService.findAll();
    }
}
