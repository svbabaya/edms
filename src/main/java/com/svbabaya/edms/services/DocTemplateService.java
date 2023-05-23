package com.svbabaya.edms.services;

import com.svbabaya.edms.models.DocTemplate;
import com.svbabaya.edms.repositories.DocTemplateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class DocTemplateService {

    private final DocTemplateRepository docTemplateRepository;

    @Autowired
    public DocTemplateService(DocTemplateRepository docTemplateRepository) {
        this.docTemplateRepository = docTemplateRepository;
    }


    public List<DocTemplate> findAll() {

        return docTemplateRepository.findAll();
    }

    @Transactional
    public void create(DocTemplate docTemplate) {

        docTemplateRepository.save(docTemplate);
    }

}
