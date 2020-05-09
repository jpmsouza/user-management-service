package com.usermanagement.rest.userservice.domains;

import com.usermanagement.rest.userservice.domains.composities.UserId;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@IdClass(UserId.class)
@Table(name = "USER")
public class User {

    @Id
    @Column(name = "STR_NAME")
    private String name;

    @Id
    @Column(name = "STR_CPF")
    private String cpf;

    @Column(name = "STR_GENDER")
    private String gender;

    @Column(name = "DAT_BIRTH")
    private LocalDate dateOfBirth;

    @Column(name = "STATUS")
    private boolean status;

    @ManyToOne
    @JoinColumn(name = "NUM_ROLE_ID")
    private Role userRole;

    @ManyToOne
    @JoinColumn(name = "NUM_PROFILE_ID")
    private Profile userProfile;
}
