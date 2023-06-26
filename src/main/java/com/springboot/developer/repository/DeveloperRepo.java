package com.springboot.developer.repository;

import com.springboot.developer.entity.Developer;
import lombok.Getter;

import java.util.ArrayList;


public class DeveloperRepo {
    @Getter
    private static final ArrayList<Developer> developersList = new ArrayList<>();

    static {
        developersList.add(new Developer(101, "Hardeek", "hardikbhatia@gmail.com", "Java", 1));
        developersList.add(new Developer(102, "Yash", "yashtailor@gmail.com", "Java", 2));
        developersList.add(new Developer(103, "Mihir", "mihir12@gmail.com", "Java", 2));
        developersList.add(new Developer(104, "Arpit", "arpit1223@gmail.com", "Java", 5));
        developersList.add(new Developer(105, "Parth", "parth@gmail.com", ".net", 2));
        developersList.add(new Developer(106, "Rakesh", "rakesh23@gmail.com", ".net", 4));
        developersList.add(new Developer(107, "Suresh", "suresh@gmail.com", ".net", 7));
        developersList.add(new Developer(108, "Mahesh", "mahesh312@gmail.com", ".net", 12));
        developersList.add(new Developer(109, "Manish", "manish312@gmail.com", "Angular", 3));
        developersList.add(new Developer(110, "Rohit", "rohit@gmail.com", "Angular", 5));
        developersList.add(new Developer(111, "Mohit", "mohit@gmail.com", "Angular", 15));
        developersList.add(new Developer(112, "Rohan", "mohan@gmail.com", "Angular", 20));
    }
}
