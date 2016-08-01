package com.demo.model;


import org.springframework.beans.factory.annotation.Autowired;

public class Car {

    private String carName;

    @Autowired
    private Engine engine;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car [carName=" + carName + ", engine=" + engine.getEngingName() + "]";
    }

}