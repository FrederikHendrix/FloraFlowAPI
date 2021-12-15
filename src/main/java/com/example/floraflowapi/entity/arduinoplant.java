package com.example.floraflowapi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class arduinoplant {
    @Id
    private int id;
    private String name;
    private int humidity;
    private int lightsensor;
    private String plantstate;
    private String pumpstate;


    public arduinoplant(int id, String name, int humidity, int lightsensor, String plantstate, String pumpstate) {
        this.id = id;
        this.name = name;
        this.humidity = humidity;
        this.lightsensor = lightsensor;
        this.plantstate = plantstate;
        this.pumpstate = pumpstate;
    }

    public arduinoplant() {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getLightsensor() {
        return lightsensor;
    }

    public void setLightsensor(int lightsensor) {
        this.lightsensor = lightsensor;
    }

    public String getPlantstate() {
        return plantstate;
    }

    public void setPlantstate(String plantstate) {
        this.plantstate = plantstate;
    }

    public String getPumpstate() {
        return pumpstate;
    }

    public void setPumpstate(String pumpstate) {
        this.pumpstate = pumpstate;
    }

}
