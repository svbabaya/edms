package com.svbabaya.edms.models;
import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = false)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Credential extends AbstractEntity {
    private String text;
    private String version;
    @Enumerated(EnumType.STRING)
    private TypeOfContractor typeOfContractor;

}
