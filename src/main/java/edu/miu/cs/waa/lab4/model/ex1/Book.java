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
public class Book extends Product{
    private String title;

    public Book(Long id, String name, double price, String description, String title) {
        super(id, name, price, description);
        this.title = title;
    }
}
