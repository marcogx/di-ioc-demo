package com.artgeektech.iocdemo.tesla.ac;

import com.artgeektech.iocdemo.tesla.battery.BatterySystem;
import com.artgeektech.iocdemo.tesla.battery.ChemicalBatterySystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class AirConditioner {

    private BatterySystem batterySystem = new ChemicalBatterySystem();

    public void coolDown() {
        batterySystem.providePower();
        System.out.println(this.getClass().getSimpleName() + " is cooling down the car\n\n");
    }
}
