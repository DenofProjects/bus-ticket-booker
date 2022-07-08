package com.passenger.feign.config;

import com.passenger.pojo.PassengerDetails;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "database-service")
public interface FeignConfig {
    @PostMapping("/db/save-passenger")
    void savePassengerDetails(PassengerDetails passengerRequest);
}
