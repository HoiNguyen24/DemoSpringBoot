package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.annotations.BatchSize;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotEmpty(message = "Không được để chống tên")
    private String name;
    @Pattern(regexp = "[0-9]{9}",message = "Số điện thoại phải có chín số")
    private String phonenumber;
    @Email(message = "Phải đúng định dạng của một Email")
    private String gmail;
    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinTable(name = "address_details",
               joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns =@JoinColumn(name="address_id")
    )
    private Set<Address> address;

    private String gender;
    @Pattern(regexp = "(0[1-9]|1[0-9]|2[0-9]|3[01]).(0[1-9]|1[012]).([19]{2})?([1-9]{2})\n",message = "Phải viết đúng định dạng của ngày tháng sinh")
    private String birthday;
    public User() {
    }
}
