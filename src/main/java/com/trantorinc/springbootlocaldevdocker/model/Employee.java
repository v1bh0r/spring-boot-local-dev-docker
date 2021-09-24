package com.trantorinc.springbootlocaldevdocker.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "Name")
    @Getter @Setter private String name;

    public String toString() {
        return "Employee - Id: " + id + ", Name: " + name;
    }
}
