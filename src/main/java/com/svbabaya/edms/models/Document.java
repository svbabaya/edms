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
    private DocTitle docTitle;
    @OneToOne (cascade = CascadeType.ALL)
    private DocTemplate template;
    @OneToOne (cascade = CascadeType.ALL)
    private DocFile file;
    @OneToMany (fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn (name = "document_id")
    private List<DocField> fields;

//    @OneToMany (/*mappedBy = "documents", */fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    private List<Contractor> contractors;

//    @OneToMany (fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinColumn (name = "document_id")
//    private List<DocRelated> docRelatedList;

}
