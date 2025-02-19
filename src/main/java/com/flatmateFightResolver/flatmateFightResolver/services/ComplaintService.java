package com.flatmateFightResolver.flatmateFightResolver.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.flatmateFightResolver.flatmateFightResolver.entities.Complaint;
import com.flatmateFightResolver.flatmateFightResolver.entities.User;
import com.flatmateFightResolver.flatmateFightResolver.repositories.ComplaintRepository;
import com.flatmateFightResolver.flatmateFightResolver.repositories.UserRepository;

@Service
public class ComplaintService {
    @Autowired
    private ComplaintRepository complaintRepository;
    @Autowired
    private UserRepository userRepository;

    public Complaint fileComplaint(Complaint complaint, String userEmail) {
        User user = userRepository.findByEmail(userEmail).orElseThrow(() -> new UsernameNotFoundException("User not found"));
        System.out.print(user);
        complaint.setUser(user);
        return complaintRepository.save(complaint);
    }

    public List<Complaint> getAllComplaints() {
        return complaintRepository.findByResolvedFalseOrderByTimestampDesc();
    }

    public void resolveComplaint(Long complaintId) {
        Complaint complaint = complaintRepository.findById(complaintId).orElseThrow(() -> new RuntimeException("Complaint not found"));
        complaint.setResolved(true);
        complaintRepository.save(complaint);
    }
}

