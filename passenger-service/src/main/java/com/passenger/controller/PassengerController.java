package com.passenger.controller;

import com.passenger.constants.PassengerConstants;
import com.passenger.pojo.PassengerDetails;
import com.passenger.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/passenger")
public class PassengerController {

    @Autowired
    private PassengerService passengerService;

    @GetMapping("/health")
    public String healthCheck() {
        return PassengerConstants.HEALTH_CHECK;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<String> createPassenger(@RequestBody PassengerDetails passengerRequest) {
        try {
            passengerService.createPassenger(passengerRequest);
            return new ResponseEntity<>(PassengerConstants.SUCCESS, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(PassengerConstants.FAILURE, HttpStatus.OK);
        }
    }
}
