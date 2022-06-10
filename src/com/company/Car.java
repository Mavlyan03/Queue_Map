package com.company;

public class Car {
    private int ID;
    private int carNumber;

    public Car(int ID, int carNumber) {
        this.ID = ID;
        this.carNumber = carNumber;
    }

    @Override
    public String toString() {
        return "ID=" + ID +
                ", carNumber=" + carNumber;
    }
}
