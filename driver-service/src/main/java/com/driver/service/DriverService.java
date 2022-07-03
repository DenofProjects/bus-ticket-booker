package com.driver.service;

import com.driver.openFiegn.DatabaseOpenFiegnService;
import com.driver.pojo.DriverDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverService {
    @Autowired
    private DatabaseOpenFiegnService databaseOpenFiegnService;

    public void createDriver(DriverDetails driverRequest) {

    }

    public String getDriverDetailsFromDbService() {
        return databaseOpenFiegnService.getDriverDetails();
    }
}
