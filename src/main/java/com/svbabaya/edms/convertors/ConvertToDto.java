package com.svbabaya.edms.convertors;

import com.svbabaya.edms.dtos.*;
import com.svbabaya.edms.models.*;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class ConvertToDto {
    private final ModelMapper mapper;

    public DocumentDto toDocDto(Document entity) {
        DocumentDto dto = mapper.map(entity, DocumentDto.class);
        dto.setTemplate(toTemplateDto(entity.getTemplate()));
        dto.setFile(toFileDto(entity.getFile()));
        dto.setFields(entity.getFields().stream()
                .map(this::toFieldDto).toList());
        dto.setContractors(entity.getContractors().stream()
                .map(this::toContractorDto).toList());
        return dto;
    }

    public DocTemplateDto toTemplateDto(DocTemplate entity) {

        return mapper.map(entity, DocTemplateDto.class);
    }

    public DocFileDto toFileDto(DocFile entity) {

        return mapper.map(entity, DocFileDto.class);
    }

    public DocFieldDto toFieldDto(DocField entity) {

//        mapper.typeMap(DocField.class, DocField.class)
//                .addMappings(mapper -> mapper.skip(DocField::setPlaceholder));

        return mapper.map(entity, DocFieldDto.class);
    }

    public ContractorDto toContractorDto(Contractor entity) {

        return mapper.map(entity, ContractorDto.class);
    }


}
