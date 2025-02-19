package com.flatmateFightResolver.flatmateFightResolver.repositories;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flatmateFightResolver.flatmateFightResolver.entities.Vote;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    List<Vote> findByComplaintId(Long complaintId);
}
