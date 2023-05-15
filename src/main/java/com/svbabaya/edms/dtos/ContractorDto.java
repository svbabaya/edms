package com.svbabaya.edms.dtos;

import com.svbabaya.edms.models.Comment;
import com.svbabaya.edms.models.Credential;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Component
public class ContractorDto {
    private Long id;
    private String firstName;
    private String patronymic;
    private String lastName;
    private String country;
    private String phone;
    private String email;
    private String telegram;

    // Make DTO

    @OneToOne
    private Credential credential;

    @OneToMany
    @JoinColumn (name = "contractor_id")
    private List<Comment> comments;

    @ManyToMany //(mappedBy = "contractors")
    private Set<DocumentDto> documents;

}
