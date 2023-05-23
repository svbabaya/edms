package com.svbabaya.edms.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
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
//    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String placeholder;
    @JsonProperty("default")
    private String defaultValue;

}
