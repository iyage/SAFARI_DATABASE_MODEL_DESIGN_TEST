package com.example.models.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class State_Pronvices {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private  String stateName;
    @OneToMany
    private List<Cities>listOfCitiesInAState;
    @OneToOne(mappedBy = "workArea")
    private DispatchRider dispatchRider;
}
