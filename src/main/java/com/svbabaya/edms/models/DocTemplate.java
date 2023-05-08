package com.svbabaya.edms.models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class DocTemplate {
    @Id
    private Long id;
    private String title;
    private String version;
    private LocalDateTime createdAt;

//    private List<DocField> templateFields;
    private Boolean removed;

    @OneToOne (mappedBy = "template", fetch = FetchType.LAZY)
    @MapsId
    private Document document;
}
