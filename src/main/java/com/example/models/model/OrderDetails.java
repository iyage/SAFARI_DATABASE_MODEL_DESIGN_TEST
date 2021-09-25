package com.example.models.model;

import javax.persistence.*;

@Entity
public class OrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private Integer quantity;
    private  Double price;
    @OneToOne
    private  Products product;


}
