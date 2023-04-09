package com.knoldus.MySpringAssignment.controller;

import com.knoldus.MySpringAssignment.services.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    //field injection
    @Autowired
    StatusService services;

    @GetMapping("/status")
    public String getTime() {
        return services.getCurrentTime();
    }
}
