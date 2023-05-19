package com.svbabaya.edms.models;
import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = false)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class DocField extends AbstractEntity {
    private String name;
    private String type;
    private String placeholder;
    private String defaultValue;

}
