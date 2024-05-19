package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import net.sf.jsqlparser.schema.Database;
import org.hibernate.type.descriptor.jdbc.VarcharJdbcType;



import java.lang.reflect.Type;
import java.util.Set;

@Entity
@Data
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinTable(name = "cart_detail",
            joinColumns = @JoinColumn(name="cart_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private Set<Product> products;
    @OneToOne
    private Account account;
}
