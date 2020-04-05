package com.usermanagement.rest.userservice.domains;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NUM_ID")
    private long id;

    @Column(name = "STR_NAME")
    private String name;

    @Column(name = "STR_CPF")
    private String cpf;

    @Column(name = "STR_GENDER")
    private String gender;

    @Column(name = "DAT_BIRTH")
    private LocalDate dateOfBirth;

    @Column(name = "STATUS")
    private boolean status;
}
