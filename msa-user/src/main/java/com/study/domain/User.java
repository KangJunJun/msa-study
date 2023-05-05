package com.study.domain;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import org.springframework.data.annotation.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column
    private String displayName;

    @Column(nullable = false)
    public String registeredEmail;

    @Column(nullable = false)
    public String cognitoSubjectClaim;

    @Column
    public String avatarImageSrc;

    @Column
    private LocalDateTime lastLoggedInAt;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    public LocalDateTime updatedAt;


    protected User(){
    }

    public User(
            String name,
            String registeredEmail,
            String cognitoSubjectClaim
    ) {
        this.name = name;
        this.registeredEmail = registeredEmail;
        this.cognitoSubjectClaim = cognitoSubjectClaim;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}