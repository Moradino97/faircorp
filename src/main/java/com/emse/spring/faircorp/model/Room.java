package com.emse.spring.faircorp.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ROOM")
public class Room {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable=false)
    private int floor;

    @Column(nullable=false)
    private String name;

    private double CurrentTemperature;

    private double TargetTemperature;

    @OneToMany
    List<Heater> HeatersList;

    @OneToMany
    List<Window> WidowsList;


    public Room() {
    }

    public Room(String name, double CurrentTemp, double TargetTemp,int floor ) {
        this.CurrentTemperature = CurrentTemp;
        this.TargetTemperature = TargetTemp;
        this.floor = floor;
        this.name = name;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
