package com.artgeektech.iocdemo.electriccar.tire;

public class TireV1 implements Tire {

    public TireV1() {

    }

    @Override
    public void run() {
        System.out.println(this.getClass().getSimpleName() + " is running\n");
    }
}
