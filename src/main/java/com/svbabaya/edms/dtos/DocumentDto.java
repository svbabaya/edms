package com.svbabaya.edms.dtos;

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
    @Enumerated(EnumType.STRING)
    private DocTitle docTitle;
//    private DocTemplateDto template;
//    private DocFileDto file;
//    private List<DocFieldDto> fields;
//    private Set<ContractorDto> contractors;
//    private Set<DocRelated> related;

}
