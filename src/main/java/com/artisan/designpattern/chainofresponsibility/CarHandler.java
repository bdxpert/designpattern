package com.artisan.designpattern.chainofresponsibility;

public abstract class CarHandler {
    protected CarHandler carHandler;
    public CarHandler(CarHandler carHandler) {
        this.carHandler = carHandler;
    }
    public CarHandler getNextHandler()
    {
        return this.carHandler;
    }
    public abstract void handleCar(int speed, String license);
}
