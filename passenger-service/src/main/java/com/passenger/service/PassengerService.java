package com.passenger.service;

import com.passenger.feign.config.FeignConfig;
import com.passenger.pojo.PassengerDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PassengerService {
    @Autowired
    private FeignConfig feignConfig;
    public void createPassenger(PassengerDetails passengerRequest) {
        UUID uuid = UUID.randomUUID();
        passengerRequest.setId(uuid.toString());
        feignConfig.savePassengerDetails(passengerRequest);
    }
}
