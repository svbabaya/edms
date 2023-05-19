package com.svbabaya.edms.models;

import jakarta.persistence.Entity;
import lombok.*;

@EqualsAndHashCode(callSuper = false)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class DocRelated extends AbstractEntity {
    private Long relatedId;

}
