package com.database.controller;

import com.database.constants.DatabaseConstants;
import com.database.pojo.PassengerRequest;
import com.database.service.DatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/db")
public class DatabaseController {

    @Autowired
    private DatabaseService databaseService;
    @GetMapping("/health")
    public String healthCheck() {
        return DatabaseConstants.HEALTH;
    }

    @RequestMapping(value = "/driver-details" , method = RequestMethod.GET)
    public String getDriverDetails(){
        System.out.println("In hre");
        return "Driver : Shantanau mukharji";
    }

    @RequestMapping(value="/save-passenger", method = RequestMethod.POST)
    public void savePassengerDetails(@RequestBody PassengerRequest passengerRequest){
        databaseService.savePassengerDetails(passengerRequest);
    }
}
