package com.svbabaya.edms.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.svbabaya.edms.models.DocTitle;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DocTemplateDto extends AbstractDto {
    private String title;
    private String version;
    @JsonProperty("type")
    @Enumerated(EnumType.STRING)
    private DocTitle docTitle;

}
