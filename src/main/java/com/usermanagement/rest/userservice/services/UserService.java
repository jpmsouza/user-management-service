package com.usermanagement.rest.userservice.services;

import com.usermanagement.rest.userservice.domains.User;

import java.util.List;

/**
 * Interface to abstract the implementation of Services provided to handle User information
 */
public interface UserService {

    /**
     * Find all user
     *
     * @return List of User Objects
     * @author João Pedro Martins Souza
     */
   public List<User> findAllUsers();

    /**
     * Crate/Insert a new User register
     * @param user User object
     * @return User Object
     * @author João Pedro Martins Souza
     */
   public User saveUser(User user);

}
