package com.example.ht3.domain;
import jakarta.persistence.*;

@Entity
@Table(name ="professors")
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String lastName;

    @Column
    private String email;

    @Column(name = "fullName")
    private String fullName;

    public Professor(){

    }

    public Professor(String name,String lastName,String email, String fullName){
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.fullName = fullName;
    }
}
