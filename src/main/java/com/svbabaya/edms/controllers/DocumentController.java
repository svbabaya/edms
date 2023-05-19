package com.svbabaya.edms.controllers;

import com.svbabaya.edms.convertors.DocumentConvertor;
import com.svbabaya.edms.dtos.DocumentDto;
import com.svbabaya.edms.models.DocTitle;
import com.svbabaya.edms.models.Document;
import com.svbabaya.edms.services.DocumentService;
import com.svbabaya.edms.utils.DocumentListIsEmptyException;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/document")
@RequiredArgsConstructor
public class DocumentController {
    private final DocumentService docService;
    private final DocumentConvertor docConvertor;

    @GetMapping("/all")
    public List<DocumentDto> getAllDocs() {
        List<DocumentDto> list = docService.findAll()
                .stream().map(docConvertor::convertToDto)
                .toList();
        if (list.isEmpty()) {
            throw new DocumentListIsEmptyException();
        }
        return list;
    }

}
