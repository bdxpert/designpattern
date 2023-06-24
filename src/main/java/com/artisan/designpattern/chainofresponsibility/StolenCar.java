package com.artisan.designpattern.chainofresponsibility;

import java.util.Arrays;

public class StolenCar  extends CarHandler {
    String[] arr = {"444","000"};

    public StolenCar(CarHandler nextHandler) {
        super(nextHandler);
    }
    @Override
    public void handleCar(int speed, String license) {
        if(Arrays.stream(arr).filter(item->item.equals(license)).count() >0 ) {
            System.out.println("Car is stolen");
        } else {
            carHandler.handleCar(speed,license);
        }
    }
}
