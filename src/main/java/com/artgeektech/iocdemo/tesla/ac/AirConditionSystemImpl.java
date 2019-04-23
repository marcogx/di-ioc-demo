package com.artgeektech.iocdemo.tesla.ac;

import com.artgeektech.iocdemo.tesla.battery.BatterySystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AirConditionSystemImpl implements AirConditionSystem {

    private BatterySystem batterySystem;

    @Autowired
    public AirConditionSystemImpl(@Qualifier("chemical") BatterySystem batterySystem) {
        this.batterySystem = batterySystem;
    }

    @Override
    public void coolDown() {
        batterySystem.providePower();
        System.out.println(this.getClass().getSimpleName() + " is cooling down the car\n\n");
    }
}
