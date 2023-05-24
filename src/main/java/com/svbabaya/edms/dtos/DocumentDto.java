package com.svbabaya.edms.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.svbabaya.edms.models.*;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DocumentDto extends AbstractDto {
    private String number;
    @JsonProperty("type")
    @Enumerated(EnumType.STRING)
    private DocTitle docTitle;
//    @JsonInclude(JsonInclude.Include.NON_NULL)
    private DocTemplateDto template;
    private DocFileDto file;
    private List<DocFieldDto> fields;

//    private List<ContractorDto> contractors;
//    private Set<DocRelated> related;

}
