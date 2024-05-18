package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "address")
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String address;

    public Address() {
    }
}
