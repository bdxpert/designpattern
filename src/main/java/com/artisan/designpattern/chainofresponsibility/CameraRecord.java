package com.artisan.designpattern.chainofresponsibility;

public class CameraRecord {
    private int speed = 1000;
    private String license = "111";

    public CameraRecord(int speed, String license) {
        this.speed = speed;
        this.license = license;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }
}
