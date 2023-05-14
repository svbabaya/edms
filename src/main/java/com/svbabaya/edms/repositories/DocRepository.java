package com.svbabaya.edms.repositories;

import com.svbabaya.edms.models.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocRepository extends JpaRepository<Document, Long> {

}
