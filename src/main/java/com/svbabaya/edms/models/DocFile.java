package com.svbabaya.edms.models;

import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = false)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class DocFile extends AbstractEntity {
    private String name;
    private String store;
    private Long size;
    @Enumerated(EnumType.STRING)
    private Mimetype mimetype;
    private String description;

//    @OneToOne (mappedBy = "file", fetch = FetchType.LAZY)
//    @MapsId
//    Document document;

}
