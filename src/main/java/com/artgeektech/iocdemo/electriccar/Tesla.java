package com.artgeektech.iocdemo.electriccar;

import com.artgeektech.iocdemo.electriccar.battery.Battery;
import com.artgeektech.iocdemo.electriccar.battery.BatteryV1;
import com.artgeektech.iocdemo.electriccar.tire.Tire;
import com.artgeektech.iocdemo.electriccar.tire.TireV1;

public class Tesla {

    private Battery battery = new BatteryV1();

    private Tire tire = new TireV1();

    public void start() {
        System.out.println("Tesla is starting....");
        battery.providePower();
        tire.run();
    }
}
