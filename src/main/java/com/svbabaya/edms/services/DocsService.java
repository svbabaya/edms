package com.svbabaya.edms.services;

import com.svbabaya.edms.models.Document;
import com.svbabaya.edms.repositories.DocRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DocsService {

    private final DocRepository docRepository;

    @Autowired
    public DocsService(DocRepository docRepository) {
        this.docRepository = docRepository;
    }

    public List<Document> findAll() {
        return docRepository.findAll();
    }



}
