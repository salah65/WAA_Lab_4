package edu.miu.cs.waa.lab4.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DVD extends Product{
    private String genre;

    public DVD(Long id, String name, double price, String description, String genre) {
        super(id, name, price, description);
        this.genre = genre;
    }
}

