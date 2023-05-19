package com.svbabaya.edms.models;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@EqualsAndHashCode(callSuper = false)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class DocTemplate extends AbstractEntity {
    private String title;
    private String version;

//    @OneToOne (mappedBy = "template", fetch = FetchType.LAZY)
//    @MapsId
//    private Document document;

    @OneToMany
    @JoinColumn (name = "template_id")
    private List<DocField> templateFields;

}
