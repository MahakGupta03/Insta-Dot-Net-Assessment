package com.flatmateFightResolver.flatmateFightResolver.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.flatmateFightResolver.flatmateFightResolver.entities.Complaint;
import com.flatmateFightResolver.flatmateFightResolver.entities.User;
import com.flatmateFightResolver.flatmateFightResolver.entities.Vote;
import com.flatmateFightResolver.flatmateFightResolver.repositories.ComplaintRepository;
import com.flatmateFightResolver.flatmateFightResolver.repositories.UserRepository;
import com.flatmateFightResolver.flatmateFightResolver.repositories.VoteRepository;

@Service
public class VoteService {
    @Autowired
    private VoteRepository voteRepository;
    @Autowired
    private ComplaintRepository complaintRepository;
    @Autowired
    private UserRepository userRepository;

    public void vote(Long complaintId, String userEmail, boolean upvote) {
        User user = userRepository.findByEmail(userEmail).orElseThrow(() -> new UsernameNotFoundException("User not found"));
        Complaint complaint = complaintRepository.findById(complaintId).orElseThrow(() -> new RuntimeException("Complaint not found"));

        Vote vote = new Vote();
        vote.setUser(user);
        vote.setComplaint(complaint);
        vote.setUpvote(upvote);

        voteRepository.save(vote);
    }

    public List<Vote> getVotesForComplaint(Long complaintId) {
        return voteRepository.findByComplaintId(complaintId);
    }
}

