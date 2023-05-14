package com.svbabaya.edms.repositories;

import com.svbabaya.edms.models.DocRelated;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocRelatedRepository extends JpaRepository<DocRelated, Long> {

}
