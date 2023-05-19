package com.svbabaya.edms.dtos;

import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DocTemplateDto extends AbstractDto {
    private String title;
    private String version;

}
