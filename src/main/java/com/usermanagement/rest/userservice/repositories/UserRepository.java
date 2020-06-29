package com.usermanagement.rest.userservice.repositories;

import com.usermanagement.rest.userservice.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {

    @Query(value = "select u from User u")
    List<User> findAllUsers();

    boolean existsByCpf(String cpf);

    @Transactional
    @Modifying
    @Query(value = "delete from User p where p.cpf = :cpf")
    void deleteByCpf(@Param("cpf") String cpf);

}
