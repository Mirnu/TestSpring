package ru.mirn.demo.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.Generated;
import lombok.NonNull;

import java.time.LocalDate;
import java.time.Period;

@Data
@Entity
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    @Column(unique = true)
    private String email;
    @Transient
    private int age;

    public int getAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }
}