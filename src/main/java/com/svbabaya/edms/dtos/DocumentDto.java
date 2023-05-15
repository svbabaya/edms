package com.svbabaya.edms.dtos;

import com.svbabaya.edms.models.*;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Component
public class DocumentDto {
    private Long id;
    private String number;
    private DocTitle docTitle;

    // Make DTO

    @OneToOne
    private DocTemplate template;

    @OneToOne
    private DocFile file;

    @OneToMany
    @JoinColumn (name = "document_id")
    private List<DocField> completedFields;

    @ManyToMany (mappedBy = "documents")
    private Set<ContractorDto> contractors;

    @OneToMany
    @JoinColumn (name = "document_id")
    private List<DocRelated> docRelatedList;

}
