package com.artgeektech.iocdemo;

import com.artgeektech.iocdemo.tesla.Tesla;
import com.artgeektech.iocdemo.tesla.battery.BatterySystem;
import com.artgeektech.iocdemo.tesla.battery.ChemicalBatterySystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class IoCMainApplication implements CommandLineRunner {

    @Autowired
    private ApplicationContext IoCContainer;

    public static void main(String[] args) {
        SpringApplication.run(IoCMainApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Tesla tesla = IoCContainer.getBean(Tesla.class);
        tesla.start();
        BatterySystem batterySystem1 = IoCContainer.getBean(ChemicalBatterySystem.class);
        BatterySystem batterySystem2 = IoCContainer.getBean(ChemicalBatterySystem.class);
        System.out.println("Dependency of BatterySystem is called twice, the single instance is return: " + (batterySystem1 == batterySystem2) + "\n\n");
    }
}
