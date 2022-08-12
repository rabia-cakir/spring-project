package com.etiya.northwind.entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="cities")
public class City {

    @Id
    @Column(name="city_id")
    private int cityId;

    @Column(name="city_name")
    private String cityName;

    @OneToMany(mappedBy = "city")
    private List<Customer> customers;

    @OneToMany(mappedBy = "city")
    private List<Employee> employees;

    @OneToMany(mappedBy = "city")
    private List<Supplier> suppliers;
}
