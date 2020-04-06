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
     *
     * @return
     */
    @GetMapping()
    public ResponseEntity<List<User>> getAllUsers(){
        return new ResponseEntity<List<User>>(userService.findAllUsers(), HttpStatus.OK);
    }

    /**
     *
     * @param idUser
     * @return
     */
    @GetMapping("/{idUser}")
    public ResponseEntity<User> getAllUsersById(@PathVariable long idUser){
        return new ResponseEntity<User>(userService.findUserById(idUser), HttpStatus.OK);
    }

    /**
     *
     * @param cpfUser
     * @return
     */
    @GetMapping(params = "cpf")
    public ResponseEntity<User> getUserByCpf(@RequestParam("cpf") String cpfUser){
        return new ResponseEntity<User>(userService.findUserByCpf(cpfUser),HttpStatus.OK);
    }
}
