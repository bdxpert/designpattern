package com.artisan.designpattern.chainofresponsibility;

public class CamReceiver {
    private CarHandler carHandler;


    public void setCarHandler(CarHandler carHandler) {
        this.carHandler = carHandler;
    }

    public void handleCar(int speed, String license) {
        CameraRecord record = new CameraRecord(speed, license);
        carHandler.handleCar(record.getSpeed(), record.getLicense());
    }
}
