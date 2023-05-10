package com.svbabaya.edms.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Contractor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String patronymic;
    private String lastName;
    private Long credentialId;
    private String country;
    private String phone;
    private String email;
    private String telegram;
    private Boolean removed;

    @OneToMany
    @JoinColumn (name = "contractor_id")
    private List<Comment> comments;

    @ManyToMany
    private Set<Document> documents;

}
