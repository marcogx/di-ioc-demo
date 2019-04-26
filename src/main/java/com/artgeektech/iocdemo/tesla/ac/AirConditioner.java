package com.artgeektech.iocdemo.tesla.ac;

import com.artgeektech.iocdemo.tesla.battery.BatterySystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AirConditioner {

    @Autowired
    @Qualifier("chemical")
    private BatterySystem batterySystem;

    public void coolDown() {
        batterySystem.providePower();
        System.out.println(this.getClass().getSimpleName() + " is cooling down the car\n\n");
    }

//    @Autowired
//    public AirConditioner(@Qualifier("chemical") BatterySystem batterySystem) {
//        this.batterySystem = batterySystem;
//    }

}
