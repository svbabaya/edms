package com.svbabaya.edms.models;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@Entity
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String number;
    private DocTitle docTitle;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
//    private Long templateId;
//    private Long fileId;
    private Set<Contractor> contractors;
    private List<DocField> completedFields;
    private Boolean removed;

}
