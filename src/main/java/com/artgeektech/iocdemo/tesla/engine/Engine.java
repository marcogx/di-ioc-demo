package com.artgeektech.iocdemo.tesla.engine;

import com.artgeektech.iocdemo.tesla.battery.BatterySystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Engine {

    private BatterySystem batterySystem;

    @Autowired
    public Engine(@Qualifier("solar") BatterySystem batterySystem) {
        this.batterySystem = batterySystem;
    }

    public void run() {
        batterySystem.providePower();
        System.out.println(this.getClass().getSimpleName() + " is running\n\n" );
    }
}