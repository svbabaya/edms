package com.svbabaya.edms.models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class DocTemplate implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String version;
    private LocalDateTime createdAt;
    private Boolean removed;

//    @OneToOne (mappedBy = "template", fetch = FetchType.LAZY)
//    @MapsId
//    private Document document;

    @OneToMany
    @JoinColumn (name = "template_id")
    private List<DocField> templateFields;

}
