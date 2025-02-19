package com.flatmateFightResolver.flatmateFightResolver.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flatmateFightResolver.flatmateFightResolver.entities.Complaint;

@Repository
public interface ComplaintRepository extends JpaRepository<Complaint, Long> {
    List<Complaint> findByResolvedFalseOrderByTimestampDesc();
}
