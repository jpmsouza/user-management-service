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
     *
     * @return
     */
    public List<User> findAllUsers(){
        return userRepository.findAllUsers();
    }

    /**
     *
     * @param idUser
     * @return
     */
    public User findUserById(long idUser){
        return userRepository.findUserById(idUser);
    }

    /**
     *
     * @param cpf
     * @return
     */
    public User findUserByCpf(String cpf){
        return userRepository.findUserByCpf(cpf);
    }
}
