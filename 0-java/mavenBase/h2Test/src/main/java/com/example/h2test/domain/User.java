package com.example.h2test.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@JsonIgnoreProperties(value = {"hibernateLazyInitializer"})
@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private Integer age;

    @Column
    private String email;
}

