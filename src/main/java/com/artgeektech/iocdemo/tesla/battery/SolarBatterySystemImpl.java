package com.artgeektech.iocdemo.tesla.battery;

import org.springframework.stereotype.Component;

@Component(value = "solar")
public class SolarBatterySystemImpl implements BatterySystem {

    @Override
    public void providePower() {
        System.out.println(this.getClass().getSimpleName() + " is providing power for ");
    }
}
