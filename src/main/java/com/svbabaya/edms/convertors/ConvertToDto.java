package com.svbabaya.edms.convertors;

import com.svbabaya.edms.dtos.*;
import com.svbabaya.edms.models.*;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;


@Component
@AllArgsConstructor
public class ConvertToDto {
    private final ModelMapper mapper;

    public DocumentDto toDocDto(Document entity) {

//        mapper.typeMap(Document.class, DocumentDto.class)
//                .addMappings(m -> m.skip(DocumentDto::setTemplate));

        DocumentDto dto = mapper.map(entity, DocumentDto.class);
        dto.setTemplate(toNoTimestampTemplateDto(entity.getTemplate()));
        dto.setFile(toNoTimestampTemplateFileDto(entity.getFile()));
        dto.setFields(entity.getFields().stream()
                .map(this::toNoTimestampFieldDto).toList());
//        dto.setContractors(entity.getContractors().stream()
//                .map(this::toContractorDto).toList());
        return dto;
    }

    public DocTemplateDto toNoTimestampTemplateDto(DocTemplate entity) {

        mapper.typeMap(DocTemplate.class, DocTemplateDto.class)
                .addMappings(m -> m.skip(DocTemplateDto::setCreatedAt));
        mapper.typeMap(DocTemplate.class, DocTemplateDto.class)
                .addMappings(m -> m.skip(DocTemplateDto::setUpdatedAt));

        return mapper.map(entity, DocTemplateDto.class);
    }

    public DocFileDto toNoTimestampTemplateFileDto(DocFile entity) {

        mapper.typeMap(DocFile.class, DocFileDto.class)
                .addMappings(m -> m.skip(DocFileDto::setCreatedAt));
        mapper.typeMap(DocFile.class, DocFileDto.class)
                .addMappings(m -> m.skip(DocFileDto::setUpdatedAt));

        return mapper.map(entity, DocFileDto.class);
    }

    public DocFieldDto toNoTimestampFieldDto(DocField entity) {

        mapper.typeMap(DocField.class, DocFieldDto.class)
                .addMappings(m -> m.skip(DocFieldDto::setCreatedAt));
        mapper.typeMap(DocField.class, DocFieldDto.class)
                .addMappings(m -> m.skip(DocFieldDto::setUpdatedAt));

        return mapper.map(entity, DocFieldDto.class);
    }

//    public ContractorDto toContractorDto(Contractor entity) {
//
//        return mapper.map(entity, ContractorDto.class);
//    }


}
