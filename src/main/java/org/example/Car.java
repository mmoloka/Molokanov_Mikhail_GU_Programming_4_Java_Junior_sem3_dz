package org.example;

import java.io.Serializable;

public class Car implements Serializable {
    private final String VIN;
    private String stateNumber;
    private String color;
    private int enginePower;
    private transient Contract contract;

    public Car(String VIN, String stateNumber, String color, int enginePower) {
        this.VIN = VIN;
        this.stateNumber = stateNumber;
        this.color = color;
        this.enginePower = enginePower;
    }

    public String getVIN() {
        return VIN;
    }

    public String getStateNumber() {
        return stateNumber;
    }

    public void setStateNumber(String stateNumber) {
        this.stateNumber = stateNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    @Override
    public String toString() {
        return "Car{" +
                "VIN='" + VIN + '\'' +
                ", stateNumber='" + stateNumber + '\'' +
                ", color='" + color + '\'' +
                ", enginePower=" + enginePower +
                '}';
    }
}
