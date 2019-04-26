package com.artgeektech.iocdemo.tesla;

import com.artgeektech.iocdemo.tesla.ac.AirConditioner;
import com.artgeektech.iocdemo.tesla.engine.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Tesla {

    @Autowired
    private AirConditioner airConditionSystem;

    @Autowired
    private Engine engineSystem;

    public void start() {
        System.out.println("\n\nTesla is starting....\n\n");
        airConditionSystem.coolDown();
        engineSystem.run();
    }

}
