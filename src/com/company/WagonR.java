package com.company;

public class WagonR extends Car {

    private String mileage;

    public WagonR(int mileage){
        isSedan = false;
        numberOfSeats = "4";
        this.mileage = String.valueOf(mileage);
    }

    @Override
    void getMileage() {
        System.out.println(mileage);
    }
}
