package com.artgeektech.iocdemo;

import com.artgeektech.iocdemo.tesla.Tesla;

public class IoCMainApplication {

    public static void main(String[] args) {
        Tesla tesla = new Tesla();
        tesla.start();
    }
}
