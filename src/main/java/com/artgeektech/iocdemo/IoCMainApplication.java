package com.artgeektech.iocdemo;

import com.artgeektech.iocdemo.tesla.Tesla;
import com.artgeektech.iocdemo.tesla.battery.BatterySystem;
import com.artgeektech.iocdemo.tesla.battery.ChemicalBatterySystem;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class IoCMainApplication {

    public static void main(String[] args) {
        ApplicationContext IoCContainer = SpringApplication.run(IoCMainApplication.class, args);

        Tesla tesla = IoCContainer.getBean(Tesla.class);
        tesla.start();

        BatterySystem batterySystem1 = IoCContainer.getBean(ChemicalBatterySystem.class);
        BatterySystem batterySystem2 = IoCContainer.getBean(ChemicalBatterySystem.class);
        System.out.println("Dependency of BatterySystem is called twice, the single instance is return: " + (batterySystem1 == batterySystem2) + "\n\n");

        System.out.println("Displaying all beans in container:\n");
        String[] allBeanNames = IoCContainer.getBeanDefinitionNames();
        for(String beanName : allBeanNames) {
            System.out.println(beanName);
        }
    }

}
