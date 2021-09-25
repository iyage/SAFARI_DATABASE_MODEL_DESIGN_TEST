package com.example.models.model;

import com.example.models.enums.Roles;

import javax.persistence.*;

@Entity
public class UserRoles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private Roles role;
}
