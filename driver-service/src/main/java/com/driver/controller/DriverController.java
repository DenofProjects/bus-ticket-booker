package com.driver.controller;

import com.driver.constants.DriverConstants;
import com.driver.pojo.DriverDetails;
import com.driver.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/driver")
public class DriverController {

    @Autowired
    private DriverService driverService;

    @GetMapping("/health")
    public String healthCheck() {
        return DriverConstants.HEALTH_CHECK;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<String> createDriver(@RequestBody DriverDetails driverRequest) {
        try {
            driverService.createDriver(driverRequest);
            return new ResponseEntity<>(DriverConstants.SUCCESS, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(DriverConstants.FAILURE, HttpStatus.OK);
        }
    }
}
