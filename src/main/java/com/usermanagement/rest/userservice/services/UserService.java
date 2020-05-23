package com.usermanagement.rest.userservice.services;

import com.usermanagement.rest.userservice.domains.User;
import com.usermanagement.rest.userservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    /**
     * Find all user
     *
     * @return
     */
    public List<User> findAllUsers(){
        return userRepository.findAllUsers();
    }

    public User saveUser(User user){
        return userRepository.save(user);
    }
}
