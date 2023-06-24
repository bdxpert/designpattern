package com.artisan.designpattern.adapter;

public interface DistanceAdapter {
    double computeDistanceInKilometers(String origin, String destination);
    void setDistanceCalculator(DistanceCalculator distanceCalculator);
}
