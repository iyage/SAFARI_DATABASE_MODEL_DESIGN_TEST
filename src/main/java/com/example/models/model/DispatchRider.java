package com.example.models.model;

import com.example.models.enums.Gender;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
public class DispatchRider extends User{
    public DispatchRider(Long id, String firstName, String lastName, Date dateOfBirth, String email, Gender gender,
                         LocalDateTime createDate, LocalDateTime updateDate) {
        super(id, firstName, lastName, dateOfBirth, email, gender, createDate, updateDate);
    }
    public DispatchRider() {
    }
    @OneToMany
    private List<Order>assignedOrders;
    @OneToOne
   private State_Pronvices workArea;
    @OneToMany
    private List<UserRoles>userRolesList;
}
