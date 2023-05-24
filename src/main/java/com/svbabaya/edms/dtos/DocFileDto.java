package com.svbabaya.edms.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.svbabaya.edms.models.Mimetype;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DocFileDto extends AbstractDto {
    private String name;
    private String store;
    private Long size;
    @Enumerated(EnumType.STRING)
    private Mimetype mimetype;
    private String description;

}
