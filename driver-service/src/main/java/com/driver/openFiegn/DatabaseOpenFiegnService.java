package com.driver.openFiegn;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "database-service")
public interface DatabaseOpenFiegnService {
    @GetMapping("/db/driver-details")
    public String getDriverDetails();
}
