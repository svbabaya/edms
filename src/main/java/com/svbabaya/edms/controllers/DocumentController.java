package com.svbabaya.edms.controllers;

import com.svbabaya.edms.convertors.ConvertToDto;
import com.svbabaya.edms.dtos.DocumentDto;
import com.svbabaya.edms.services.DocumentService;
import com.svbabaya.edms.utils.DocListIsEmptyException;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/document")
@AllArgsConstructor
public class DocumentController {
    private final DocumentService docService;
    private final ConvertToDto docConvertor;

    @GetMapping("/all")
    public List<DocumentDto> getAll() {
        List<DocumentDto> list = docService.findAll()
                .stream().map(docConvertor::toDocDto)
                .toList();
        if (list.isEmpty()) {
            throw new DocListIsEmptyException();
        }
        return list;
    }

}
