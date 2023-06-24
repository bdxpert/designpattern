package com.artisan.designpattern.adapter;

import java.util.Random;

public class DistanceCalculator {
    public double computeDistance(String origin, String destination) {
        return (new Random()).nextInt(100);
    }
}
