package com.knoldus.MySpringAssignment.controller;

import com.knoldus.MySpringAssignment.services.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
public class Controller {

    @Autowired
    Services services;

        @GetMapping("/time")
    public String  getTime(){
     return services.getTime();
    }
}
