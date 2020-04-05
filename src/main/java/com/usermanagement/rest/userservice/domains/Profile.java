package com.usermanagement.rest.userservice.domains;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "PROFILE")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NUM_ID")
    private long id;

    @Column(name = "STR_PROFILE")
    private String profile;
}
