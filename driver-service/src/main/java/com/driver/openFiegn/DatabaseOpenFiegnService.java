package com.driver.openFiegn;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url = "${database.service.url}", value = "database-service")
public interface DatabaseOpenFiegnService {
    @GetMapping("/driver-details")
    public String getDriverDetails();
}
