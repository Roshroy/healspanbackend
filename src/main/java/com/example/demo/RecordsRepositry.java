package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RecordsRepositry extends JpaRepository<Records,Long> {
//    List<Records> findByNameContainingIgnoreCase(String name);
@Query("SELECT r FROM Records r WHERE lower(r.name) LIKE lower(concat('%', :searchText, '%')) " +
        "OR lower(r.ailment) LIKE lower(concat('%', :searchText, '%')) " +
        "OR lower(r.SLA) LIKE lower(concat('%', :searchText, '%')) " +
        "OR lower(r.P_TAT) LIKE lower(concat('%', :searchText, '%')) " +
        "OR lower(r.stage) LIKE lower(concat('%', :searchText, '%')) " +
        "OR lower(r.status) LIKE lower(concat('%', :searchText, '%')) " +
        "OR lower(r.approved_Amount) LIKE lower(concat('%', :searchText, '%')) " +
        "OR lower(r.hospital) LIKE lower(concat('%', :searchText, '%')) " +
        "ORDER BY r.claim_id ASC")
List<Records> searchRecords(@Param("searchText") String searchText);


}
