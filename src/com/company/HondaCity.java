package com.company;

public class HondaCity extends Car {

    private String mileage;

    public HondaCity(int mileage){
        isSedan = true;
        numberOfSeats = "4";
        this.mileage = String.valueOf(mileage);
    }

    @Override
    void getMileage() {
        System.out.println(mileage);
    }
}
