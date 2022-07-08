package com.database.pojo;

import lombok.Data;

@Data
public class PassengerRequest {
    private String id;
    private String name;
    private String to;
    private String from;
    private String doj;
}
