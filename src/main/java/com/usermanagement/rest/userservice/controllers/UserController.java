package com.usermanagement.rest.userservice.controllers;

import com.usermanagement.rest.userservice.domains.User;
import com.usermanagement.rest.userservice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * Get all users
     *
     * @return ResponseEntity Object list user
     * @author João Pedro Martins Souza
     */
    @GetMapping()
    public ResponseEntity<List<User>> getAllUsers(){
        return new ResponseEntity<List<User>>(userService.findAllUsers(), HttpStatus.OK);
    }

    /**
     * Post to create a new user
     *
     * @param user User object
     * @return User object create
     * @author João Pedro Martins Souza
     */
    @PostMapping()
    public ResponseEntity<User> createNewUser(@RequestBody User user){
        return new ResponseEntity<User>(userService.saveUser(user),HttpStatus.CREATED);
    }

    @DeleteMapping("/{cpf}")
    public ResponseEntity<Object> deleteUser(@PathVariable String cpf){
        userService.deleteUserByCpf(cpf);
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

}
