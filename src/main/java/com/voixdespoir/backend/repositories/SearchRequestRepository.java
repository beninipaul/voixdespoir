package com.voixdespoir.backend.repositories;

import com.voixdespoir.backend.entities.SearchRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface SearchRequestRepository extends JpaRepository<SearchRequest, Long> {
}
