package com.artgeektech.iocdemo.electriccar.battery;

public class BatteryV1 implements Battery {

    public BatteryV1() {

    }

    @Override
    public void providePower() {
        System.out.println(this.getClass().getSimpleName() + " is providing power");
    }
}
