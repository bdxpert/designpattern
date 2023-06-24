package com.artisan.designpattern.chainofresponsibility;

import java.util.Arrays;

public class UnpaidCar extends CarHandler {
    String[] arr = {"454","010"};

    public UnpaidCar(CarHandler nextHandler) {
        super(nextHandler);
    }
    @Override
    public void handleCar(int speed, String license) {
        if(Arrays.stream(arr).filter(item->item.equals(license)).count() >0 ) {
            System.out.println("Car ticket is unpaid");
        }
    }
}
