package com.database.service;

import com.database.pojo.PassengerDAO;
import com.database.pojo.PassengerRequest;
import com.database.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatabaseService {

    @Autowired
    private PassengerRepository passengerRepository;
    public void savePassengerDetails(PassengerRequest passengerRequest){
        PassengerDAO passengerDAO = new PassengerDAO();
        passengerDAO.setId(passengerRequest.getId());
        passengerDAO.setName(passengerRequest.getName());
        passengerDAO.setDestination(passengerRequest.getTo());
        passengerDAO.setDoj(passengerRequest.getDoj());
        passengerDAO.setOrigin(passengerRequest.getTo());
        passengerRepository.save(passengerDAO);
    }
}
