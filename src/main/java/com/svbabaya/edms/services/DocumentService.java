package com.svbabaya.edms.services;

import com.svbabaya.edms.models.Document;
import com.svbabaya.edms.repositories.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class DocumentService {
    private final DocumentRepository docRepository;
    @Autowired
    public DocumentService(DocumentRepository docRepository) {

        this.docRepository = docRepository;
    }

    public List<Document> findAll() {

        return docRepository.findAll();
    }

    @Transactional
    public void create(Document document) {

        docRepository.save(document);
    }


}
