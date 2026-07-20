package com.khushi.jobapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@Data is used to generate all the getters and setters,hashCode(),equals(),toString()
@NoArgsConstructor
//Constructor with no arguments
//spring uses this constructor to create an object with the data submitted in the form
@AllArgsConstructor
//useful when we want to create objects manually

public class job {
private int id;
private String title;
private String location;
private String company;
private int salary;
private String description;
}
