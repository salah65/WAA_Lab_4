package edu.miu.cs.waa.lab4.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Order> orders;
}