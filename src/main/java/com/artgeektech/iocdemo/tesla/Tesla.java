package com.artgeektech.iocdemo.tesla;

import com.artgeektech.iocdemo.tesla.ac.AirConditioner;
import com.artgeektech.iocdemo.tesla.engine.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Tesla {

    private AirConditioner airConditionSystem;

    private Engine engineSystem;

    @Autowired
    public Tesla(AirConditioner airConditionSystem, Engine engineSystem) {
        this.airConditionSystem = airConditionSystem;
        this.engineSystem = engineSystem;
    }

    public void start() {
        System.out.println("\n\nTesla is starting....\n\n");
        airConditionSystem.coolDown();
        engineSystem.run();
    }
}
