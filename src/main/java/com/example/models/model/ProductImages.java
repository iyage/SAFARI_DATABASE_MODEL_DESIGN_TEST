package com.example.models.model;

import javax.persistence.*;

@Entity
public class ProductImages {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String imageURl;
    @ManyToOne
    private Products product;

}
