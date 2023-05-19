package com.svbabaya.edms.dtos;

import com.svbabaya.edms.models.Credential;
import lombok.*;
import java.util.List;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContractorDto extends AbstractDto {
    private String firstName;
    private String patronymic;
    private String lastName;
    private String country;
    private String phone;
    private String email;
    private String telegram;
    private Credential credential;
    private List<CommentDto> comments;
    private Set<DocumentDto> documents;

}
