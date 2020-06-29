package com.usermanagement.rest.userservice.services.implement;

import com.usermanagement.rest.userservice.domains.User;
import com.usermanagement.rest.userservice.repositories.UserRepository;
import com.usermanagement.rest.userservice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;
import java.util.List;

/**
 *  Class implementation of Services provided to handle User information
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    /**
     * Find all user
     *
     * @return List of User Objects
     * @author João Pedro Martins Souza
     */
    @Override
    public List<User> findAllUsers(){
        return userRepository.findAllUsers();
    }

    /**
     * Crate/Insert a new User register
     * @param user User object
     * @return User Object
     * @author João Pedro Martins Souza
     */
    @Override
    public User saveUser(User user){
        if(userRepository.existsByCpf(user.getCpf())){
            throw new EntityExistsException();
        }else {
            return userRepository.save(user);
        }

    }

    /**
     * Delete user from data base
     *
     * @param cpf String value
     * @author João Pedro Martins Souza
     */
    @Override
    public void deleteUserByCpf(String cpf) {
        if(userRepository.existsByCpf(cpf)){
            userRepository.deleteByCpf(cpf);
        }else{
            throw new EntityNotFoundException();
        }
    }

}
