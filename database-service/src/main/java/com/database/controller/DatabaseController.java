package com.database.controller;

import com.database.constants.DatabaseConstants;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/db")
public class DatabaseController {
    @GetMapping("/health")
    public String healthCheck() {
        return DatabaseConstants.HEALTH;
    }

    @RequestMapping(value = "/driver-details" , method = RequestMethod.GET)
    public String getDriverDetails(){
        System.out.println("In hre");
        return "Driver : Shantanau mukharji";
    }
}
