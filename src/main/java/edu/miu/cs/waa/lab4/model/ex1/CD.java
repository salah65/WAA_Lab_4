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
public class CD extends Product{
    private String artist;

    public CD(Long id, String name, double price, String description, String artist) {
        super(id, name, price, description);
        this.artist = artist;
    }
}

