package com.svbabaya.edms.repositories;

import com.svbabaya.edms.models.DocFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocFileRepository extends JpaRepository<DocFile, Long> {

}
