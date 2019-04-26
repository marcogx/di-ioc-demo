package com.artgeektech.iocdemo;

import com.artgeektech.iocdemo.tesla.battery.SolarBatterySystem;
import com.artgeektech.iocdemo.tesla.engine.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class JavaReflectionDemo {

    private static Engine engineBean;

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        System.out.println("Demo of Java Reflection\n");

        System.out.println("Before Component Annotation Handler, engineBean is null: " + engineBean + "\n");

        callComponentAnnotationHandler();

        callOfAutowiredAnnotationHandler();
    }

    private static void callComponentAnnotationHandler() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> engineClass = Class.forName("com.artgeektech.iocdemo.tesla.engine.Engine");
        Annotation[] engineClassAnnotations = engineClass.getAnnotations();

        for (Annotation annotation: engineClassAnnotations) {
            if (annotation instanceof Component) {

                engineBean = (Engine) engineClass.newInstance();

                System.out.println("engineBean is created: " + engineBean + "\n");

                //IoCContainer.add(engineBean);
            }
        }
    }

    private static void callOfAutowiredAnnotationHandler() throws ClassNotFoundException, IllegalAccessException {
        Class<?> engineClass = Class.forName("com.artgeektech.iocdemo.tesla.engine.Engine");
        Field[] fields = engineClass.getDeclaredFields();

        for (Field field: fields) {
            if (field.isAnnotationPresent(Autowired.class)) {

                // change the private permission
                field.setAccessible(true);

                System.out.println("\nEngine has a field being Autowired: " + field.getName() + "; The value now is: " + field.get(engineBean));

                SolarBatterySystem solarBatterySystem = new SolarBatterySystem();

                field.set(engineBean, solarBatterySystem);

                System.out.println("\nEngine has a field being Autowired: " + field.getName() + "; The value now is: " + field.get(engineBean));

            }
        }
    }
}
