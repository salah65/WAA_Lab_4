package edu.miu.cs.waa.lab4.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class OrderLine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int quantity;

    @ManyToOne
    private Product product;

}
