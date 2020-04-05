package com.usermanagement.rest.userservice.domains;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "ROLE")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NUM_ID")
    private long id;

    @Column(name = "STR_ROLE")
    private String role;

    @JsonIgnore
    @OneToMany(mappedBy = "userRole")
    private Set<User> users;
}
