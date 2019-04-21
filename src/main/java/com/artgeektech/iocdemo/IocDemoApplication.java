package com.artgeektech.iocdemo;

import com.artgeektech.iocdemo.electriccar.Tesla;

public class IocDemoApplication {
    public static void main(String[] args) {
        System.out.println("This is the main entry point of the application:");
        Tesla tesla = new Tesla();
        tesla.start();
    }
}
