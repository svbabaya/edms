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
public class Document extends AbstractEntity {
    private String number;
    @Enumerated(EnumType.STRING)
    private DocTitle docTitle;
//
//    @OneToOne
//    private DocTemplate template;
//
//    @OneToOne
//    private DocFile file;
//
//    @OneToMany
//    @JoinColumn (name = "document_id")
//    private List<DocField> completedFields;
//
//    @ManyToMany (mappedBy = "documents")
//    private Set<Contractor> contractors;
//
//    @OneToMany
//    @JoinColumn (name = "document_id")
//    private List<DocRelated> docRelatedList;

    @Override
    public String toString() {
        return super.toString() +
                "number=" + number +
                ", docTitle=" + docTitle +
                "}";
    }
}
