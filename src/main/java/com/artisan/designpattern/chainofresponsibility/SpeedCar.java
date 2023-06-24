package com.artisan.designpattern.chainofresponsibility;

public class SpeedCar extends CarHandler {

    public SpeedCar(CarHandler nextHandler) {
        super(nextHandler);
    }
    @Override
    public void handleCar(int speed, String license) {
        if(speed >100 ) {
            System.out.println("Car speed limit exceed");
        } else {
            carHandler.handleCar(speed,license);
        }
    }
}
