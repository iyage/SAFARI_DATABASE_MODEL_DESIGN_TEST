package com.example.models.model;

import com.example.models.enums.TransactionType;

import javax.persistence.*;
import java.util.Date;

@Entity
public class WalletTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private Date transactionDate;
    private TransactionType transactionType;
    private Double amount;

}
