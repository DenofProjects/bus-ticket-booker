package com.driver.openFiegn;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "database-service", path="/db")
public interface DatabaseOpenFiegnService {
    @GetMapping("/driver-details")
    public String getDriverDetails();
}
