package com.example.models.model;

import com.example.models.enums.DeliveryStatus;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @ManyToOne
    Customer customer;
    private Date deliveryDate;
    private DeliveryStatus deliveryStatus;
    @OneToMany
    private List<OrderDetails> eachOrderItem;
    @CreationTimestamp
    private LocalDateTime createDate;
    @UpdateTimestamp
    private LocalDateTime updateDate;
    private Double sum;
    private Double deliveryFee;
    @OneToOne
    private DeliveryMethod deliveryMethod;




}
