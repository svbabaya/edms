package com.svbabaya.edms.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class DocFile {
    @Id
    private Long id;
    private String name;
    private String store;
    private Long size;
    private Mimetype mimetype;
    private String description;
    private Boolean removed;
    @OneToOne (mappedBy = "file", fetch = FetchType.LAZY)
    @MapsId
    Document document;

}
