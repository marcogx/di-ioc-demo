package com.artgeektech.iocdemo.tesla.engine;

import com.artgeektech.iocdemo.tesla.battery.BatterySystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EngineSystemImpl implements EngineSystem {

    private BatterySystem batterySystem;

    @Autowired
    public EngineSystemImpl(@Qualifier("solar") BatterySystem batterySystem) {
        this.batterySystem = batterySystem;
    }

    @Override
    public void run() {
        batterySystem.providePower();
        System.out.println(this.getClass().getSimpleName() + " is running\n\n" );
    }
}
