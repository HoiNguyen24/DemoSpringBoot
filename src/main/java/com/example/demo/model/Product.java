package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
     @ManyToOne
    private Category category;

    private String detail;

    private double price;

    public Product() {
    }
}
