package com.svbabaya.edms.repositories;

import com.svbabaya.edms.models.DocField;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocFieldRepository extends JpaRepository<DocField, Long> {

}
