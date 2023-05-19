package com.svbabaya.edms.models;

import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = false)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Comment extends AbstractEntity {
    private String text;
    @ManyToOne
    @JoinColumn (name = "comment_id")
    private Contractor contractor;

}
