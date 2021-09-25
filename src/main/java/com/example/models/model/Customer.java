package com.example.models.model;

import com.example.models.enums.Gender;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
public class Customer extends User{
    public Customer(Long id, String firstName, String lastName, Date dateOfBirth, String email,
                    Gender gender, LocalDateTime createDate, LocalDateTime updateDate) {
        super(id, firstName, lastName, dateOfBirth, email, gender, createDate, updateDate);
    }

    public Customer() {
    }
    @OneToMany
    private List<Order>customerOrders;
    @OneToOne
    private Wallet customerWallet;
    @OneToMany(mappedBy ="customer" )
    private List<Favourites>userFavourites;
    @OneToMany
    private List<UserRoles>userRolesList;
}
