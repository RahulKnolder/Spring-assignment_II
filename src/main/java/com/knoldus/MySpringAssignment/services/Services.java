package com.knoldus.MySpringAssignment.services;

import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
public class Services {

    public String getTime() {
        return "running... " +"{ "+ LocalTime.now() +" }";
    }
}
