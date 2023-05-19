package com.svbabaya.edms.models;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;
import java.util.Set;

@EqualsAndHashCode(callSuper = false)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Contractor extends AbstractEntity {
    private String firstName;
    private String patronymic;
    private String lastName;
    private String country;
    private String phone;
    private String email;
    private String telegram;

    @OneToOne
    private Credential credential;

    @OneToMany
    @JoinColumn (name = "contractor_id")
    private List<Comment> comments;

    @ManyToMany //(mappedBy = "contractors")
    private Set<Document> documents;

}
