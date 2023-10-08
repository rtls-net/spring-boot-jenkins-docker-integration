package com.eapps.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppsController {

    @GetMapping
    public String getAppsStatus(){
        return "Spring Boot Jenkins Integration with Docker is Running";
    }
}
