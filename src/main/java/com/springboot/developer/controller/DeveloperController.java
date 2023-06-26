package com.springboot.developer.controller;

import com.springboot.developer.entity.Developer;
import com.springboot.developer.service.DeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/developer")
public class DeveloperController {

    @Autowired
    DeveloperService developerService;

    @GetMapping("/all")
    public ArrayList<Developer> allDevelopersList() {
        return developerService.getAllDevelopers();
    }

    @GetMapping("/java")
    public ArrayList<Developer> javaDevelopersList() {
        return developerService.getJavaDevelopers();
    }

    @GetMapping("/dotNet")
    public ArrayList<Developer> dotNetDevelopersList() {
        return developerService.getDotNetDevelopers();
    }

    @GetMapping("/angular")
    public ArrayList<Developer> angularDevelopersList() {
        return developerService.getAngularDevelopers();
    }
}
