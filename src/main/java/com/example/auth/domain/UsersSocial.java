package com.example.auth.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Table(name = "USERS_SOCIAL")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UsersSocial {
    @EmbeddedId
    private UsersSocialId id;

    @Column(nullable = false)
    private String uuid;
}
