package com.artgeektech.iocdemo.tesla;

import com.artgeektech.iocdemo.tesla.ac.AirConditionSystem;
import com.artgeektech.iocdemo.tesla.engine.EngineSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Tesla {

    private AirConditionSystem airConditionSystem;

    private EngineSystem engineSystem;

    @Autowired
    public Tesla(AirConditionSystem airConditionSystem, EngineSystem engineSystem) {
        this.airConditionSystem = airConditionSystem;
        this.engineSystem = engineSystem;
    }

    public void start() {
        System.out.println("\n\n\n\nTesla is starting....\n\n");
        airConditionSystem.coolDown();
        engineSystem.run();
    }
}
