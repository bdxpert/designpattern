package com.artisan.designpattern.chainofresponsibility;

public class AppChain {
    public static void main(String args[])
    {
        CamReceiver camReceiver = new CamReceiver();

        UnpaidCar unpaidCar = new UnpaidCar(null);
        NotRegisterCar notRegisterCar = new NotRegisterCar(unpaidCar);
        SpeedCar speedCar = new SpeedCar(notRegisterCar);
        StolenCar stolenCar = new StolenCar(speedCar);

        camReceiver.setCarHandler(stolenCar);
        camReceiver.handleCar(101, "111");
    }
}
