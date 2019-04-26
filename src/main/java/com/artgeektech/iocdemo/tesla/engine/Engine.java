package com.artgeektech.iocdemo.tesla.engine;

import com.artgeektech.iocdemo.tesla.battery.BatterySystem;
import com.artgeektech.iocdemo.tesla.battery.ChemicalBatterySystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class Engine {

    private BatterySystem batterySystem = new ChemicalBatterySystem();

    public void run() {
        batterySystem.providePower();
        System.out.println(this.getClass().getSimpleName() + " is running\n\n" );
    }
}
