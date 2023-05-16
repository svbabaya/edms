package com.svbabaya.edms.models;
import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Document implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String number;
    private DocTitle docTitle;
    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;
    private Boolean removed;

    @OneToOne
    private DocTemplate template;

    @OneToOne
    private DocFile file;

    @OneToMany
    @JoinColumn (name = "document_id")
    private List<DocField> completedFields;

    @ManyToMany (mappedBy = "documents")
    private Set<Contractor> contractors;

    @OneToMany
    @JoinColumn (name = "document_id")
    private List<DocRelated> docRelatedList;

}
