package com.svbabaya.edms.convertors;

import com.svbabaya.edms.dtos.DocTemplateDto;
import com.svbabaya.edms.dtos.DocumentDto;
import com.svbabaya.edms.models.DocTemplate;
import com.svbabaya.edms.models.Document;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ConvertToEntity {
    private final ModelMapper mapper;

    public Document toDocEntity(DocumentDto dto){

        return mapper.map(dto, Document.class);
    }
    public DocTemplate toDocTemplateEntity(DocTemplateDto dto){

        return mapper.map(dto, DocTemplate.class);
    }


}
