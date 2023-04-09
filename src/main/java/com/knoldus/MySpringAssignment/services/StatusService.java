package com.knoldus.MySpringAssignment.services;

import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Component
public class StatusService {
   private LocalTime currentTime;


    public String getCurrentTime() {
        //formatting the tme in HH-MM-SS
        currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = currentTime.format(formatter);
        return "Running," + "{" + formattedTime + "}";
    }

    public void setCurrentTime(LocalTime currentTime) {
        this.currentTime = currentTime;
    }
}
