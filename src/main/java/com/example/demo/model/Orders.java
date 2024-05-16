package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String address;

    private String phonenumber;

    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinTable(name = "orders_detail",
       joinColumns = {
            @JoinColumn(name = "order_id",referencedColumnName = "id")
       },
            inverseJoinColumns = {
            @JoinColumn(name="product_id",referencedColumnName = "id")
            }
    )
    private Set<Product> products;

    public Orders() {
    }
}
