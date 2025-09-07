package com.wave.Mirissa.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String contactName;
    private String street;
    private String city;
    private String state;
    private String area;
    private String zipCode;
    private String phone;


    private String country = "Sri Lanka";

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
}
