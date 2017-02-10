package com.company;

/**
 * Created by Rob on 2/9/2017.
 */
public class UsedCar extends Car {


    private double mileage;

    public UsedCar(String make, String model, int year, double price, double mileage) {
        super(make, model, year, price);
        this.mileage = mileage;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public UsedCar(String make, String model, int year, double price) {
        super(make, model, year, price);
    }

    @Override
     public String toString() {
        return super.toString() + "\t" + mileage;
        }

    }

