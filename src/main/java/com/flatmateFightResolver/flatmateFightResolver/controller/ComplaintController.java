package com.flatmateFightResolver.flatmateFightResolver.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flatmateFightResolver.flatmateFightResolver.entities.Complaint;
import com.flatmateFightResolver.flatmateFightResolver.services.ComplaintService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/complaints")
@RequiredArgsConstructor
public class ComplaintController {

    @Autowired private ComplaintService complaintService;

    @PostMapping
    public ResponseEntity<String> createComplaint(@RequestBody Complaint complaint, Principal principal) {
        if (principal == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("User is not authenticated");
        }
        complaintService.fileComplaint(complaint, principal.getName());
        return ResponseEntity.ok("Complaint submitted successfully");
    }

    @GetMapping
    public ResponseEntity<List<Complaint>> getComplaints() {
        return ResponseEntity.ok(complaintService.getAllComplaints());
    }
}
