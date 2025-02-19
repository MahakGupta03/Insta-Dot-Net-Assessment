package com.flatmateFightResolver.flatmateFightResolver.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.flatmateFightResolver.flatmateFightResolver.entities.User;
import com.flatmateFightResolver.flatmateFightResolver.repositories.UserRepository;

@Service
public class UserService {
	@Autowired private UserRepository userRepository;



    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email).orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }

    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email).orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }
}

