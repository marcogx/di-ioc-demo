package com.artgeektech.iocdemo.tesla;

import com.artgeektech.iocdemo.tesla.ac.AirConditioner;
import com.artgeektech.iocdemo.tesla.engine.Engine;

public class Tesla {

    private AirConditioner airConditionSystem = new AirConditioner();

    private Engine engineSystem = new Engine();

    public void start() {
        System.out.println("\n\nTesla is starting....\n\n");
        airConditionSystem.coolDown();
        engineSystem.run();
    }

}
