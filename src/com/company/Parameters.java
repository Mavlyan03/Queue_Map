package com.company;

public class Parameters {
    private int year;
    private int price;
    private String model;
    private String colour;

    public Parameters(int year, int price, String model, String colour) {
        this.year = year;
        this.price = price;
        this.model = model;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return
                "year=" + year +
                ", price=" + price + "$" +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'';
    }
}
