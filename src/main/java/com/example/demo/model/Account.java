package com.example.demo.model;

import ch.qos.logback.core.model.INamedModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;

    public Account() {
    }

    public Account(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
}
