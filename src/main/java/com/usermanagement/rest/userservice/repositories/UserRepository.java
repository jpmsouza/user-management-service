package com.usermanagement.rest.userservice.repositories;

import com.usermanagement.rest.userservice.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {

    @Query(value = "select u from User u")
    List<User> findAllUsers();

    @Query(value = "select u from User u where u.id = :idUser")
    User findUserById(@Param("idUser")long idUser);

    User findUserByCpf(String cpf);
}
