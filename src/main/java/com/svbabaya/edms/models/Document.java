package com.svbabaya.edms.models;
import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.*;
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
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
    @OneToOne
    @JoinColumn (name = "template_id")
    private DocTemplate template;

    @OneToOne
    @JoinColumn (name = "file_id")
    private DocFile file;

    @OneToMany
    @JoinColumn (name = "document_id")
    private Set<Contractor> contractors;

    @OneToMany
    @JoinColumn (name = "document_id")
    private List<DocField> completedFields;

    private Boolean removed;
}
