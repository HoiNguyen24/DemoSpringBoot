package com.example.demo.model;

import ch.qos.logback.core.model.INamedModel;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;
    @OneToOne
    private User user;

    private String role = "USER";

    public Account() {

    }

    public Account(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
}
