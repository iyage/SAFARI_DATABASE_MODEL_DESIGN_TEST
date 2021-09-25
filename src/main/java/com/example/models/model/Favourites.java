package com.example.models.model;

import javax.persistence.*;

@Entity
public class Favourites {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    private Customer customer;
    @OneToOne
    private  Products products;

}
