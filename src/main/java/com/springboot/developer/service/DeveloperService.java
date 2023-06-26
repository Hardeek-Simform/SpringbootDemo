package com.springboot.developer.service;

import com.springboot.developer.entity.Developer;
import com.springboot.developer.repository.DeveloperRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.stream.Collectors;

@Service
public class DeveloperService {
    public ArrayList<Developer> getJavaDevelopers() {
        return (ArrayList) DeveloperRepo.getDevelopersList().stream().filter(e -> e.getDepartment().equalsIgnoreCase("java")).collect(Collectors.toList());
    }

    public ArrayList<Developer> getDotNetDevelopers() {
        return (ArrayList) DeveloperRepo.getDevelopersList().stream().filter(e -> e.getDepartment().equalsIgnoreCase(".net")).collect(Collectors.toList());
    }

    public ArrayList<Developer> getAngularDevelopers() {
        return (ArrayList) DeveloperRepo.getDevelopersList().stream().filter(e -> e.getDepartment().equalsIgnoreCase("angular")).collect(Collectors.toList());
    }

    public ArrayList<Developer> getAllDevelopers() {
        return DeveloperRepo.getDevelopersList();
    }
}
