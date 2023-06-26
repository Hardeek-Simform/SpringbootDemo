package com.springboot.developer.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Developer {
    private int id;
    private String name;
    private String emailId;
    private String department;
    private int experience;
}
