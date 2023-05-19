package com.svbabaya.edms.convertors;

import com.svbabaya.edms.dtos.DocumentDto;
import com.svbabaya.edms.models.Document;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DocumentConvertor {
    private final ModelMapper modelMapper;

    public DocumentDto convertToDto(Document entity){

        return modelMapper.map(entity, DocumentDto.class);
    }
}
