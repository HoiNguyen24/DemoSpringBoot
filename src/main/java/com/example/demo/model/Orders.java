package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.Set;

@Entity
@Data
public class Orders {
    @Id
    private Long id;

    private String address;

    private String phonenumber;

    private Date date;

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

    private String status;

    public Orders() {
    }
}
