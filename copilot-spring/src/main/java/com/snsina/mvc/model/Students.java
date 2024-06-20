package com.snsina.mvc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

// create an entity class Students using lombok
// @Data: generate getters and setters
// @AllArgsConstructor: generate constructor with all fields
// @NoArgsConstructor: generate constructor with no fields
// @Entity: mark this class as an entity class
// @Table: map this class to a table named Students
// @Id: mark this field as the primary key
// @GeneratedValue: generate the value for this field automatically
// @Column: map this field to a column named id
// @Column: map this field to a column named name
// @Column: map this field to a column named email

@Data
@AllArgsConstructor
@Entity
@Table(name = "students")
@Getter
@Setter
@NoArgsConstructor
public class Students {

    // add fields age, email, salary
    // add annotations
    private @Id @GeneratedValue Long id;

    private String name;

    private String email;

    private int age;


    // add constructor with all fields except id
    // add constructor with no fields
    public Students(String name, String email, int age, double salary) {
        this.name = name;
        this.email = email;
        this.age = age;

    }

}
