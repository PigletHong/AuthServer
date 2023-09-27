package com.example.auth.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "USERS_EMAIL")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UsersEmail {
    @Id
    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String uuid;
}
