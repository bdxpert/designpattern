package com.artisan.designpattern.chainofresponsibility;

import java.util.Arrays;

public class NotRegisterCar extends CarHandler {
    String[] arr = {"1111", "2222", "3333"};
    public NotRegisterCar(CarHandler nextHandler) {
        super(nextHandler);
    }
    @Override
    public void handleCar(int speed, String license) {
        if(Arrays.stream(arr).filter(item->item.equals(license)).count() >0 ) {
            System.out.println("Car is not registered");
        } else {
            carHandler.handleCar(speed,license);
        }
    }
}
