package com.svbabaya.edms.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DocFieldDto extends AbstractDto {
    private String name;
    private String type;
    private String placeholder;
    private String defaultValue;

}
