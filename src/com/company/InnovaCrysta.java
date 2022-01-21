package com.company;

public class InnovaCrysta extends Car {

    private String mileage;

    public InnovaCrysta(int mileage){
        isSedan = false;
        numberOfSeats = "6";
        this.mileage = String.valueOf(mileage);
    }

    @Override
    void getMileage() {
        System.out.println(mileage);
    }
}