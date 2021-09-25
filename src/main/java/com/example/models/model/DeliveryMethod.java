package com.example.models.model;

import javax.persistence.*;

@Entity
public class DeliveryMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private  String deliveryMethod;
    @OneToOne(mappedBy = "deliveryMethod")
    private  Order order;
}
