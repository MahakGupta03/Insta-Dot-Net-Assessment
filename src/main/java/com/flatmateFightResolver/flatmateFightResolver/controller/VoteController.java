package com.flatmateFightResolver.flatmateFightResolver.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flatmateFightResolver.flatmateFightResolver.entities.Vote;
import com.flatmateFightResolver.flatmateFightResolver.services.VoteService;



@RestController
@RequestMapping("/api/votes")
public class VoteController {
    @Autowired private VoteService voteService;

    @PostMapping("/{complaintId}")
    public ResponseEntity<String> vote(@PathVariable Long complaintId, @RequestParam boolean upvote, Principal principal) {
        voteService.vote(complaintId, principal.getName(), upvote);
        return ResponseEntity.ok("Vote registered successfully");
    }

    @GetMapping("/{complaintId}")
    public ResponseEntity<List<Vote>> getVotes(@PathVariable Long complaintId) {
        return ResponseEntity.ok(voteService.getVotesForComplaint(complaintId));
    }
}


