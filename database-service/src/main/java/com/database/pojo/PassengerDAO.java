package com.database.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "passenger")
public class PassengerDAO {
    @Id
    @Column(name = "pid")
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "origin")
    private String origin;
    @Column(name = "destination")
    private String destination;
    @Column(name = "doj")
    private String doj;
}
