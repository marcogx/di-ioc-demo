package com.artgeektech.iocdemo;

import com.artgeektech.iocdemo.tesla.Tesla;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class IoCDemoApplication implements CommandLineRunner {

    @Autowired
    private ApplicationContext IoCContainer;

    public static void main(String[] args) {
        SpringApplication.run(IoCDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Tesla tesla = IoCContainer.getBean(Tesla.class);
        tesla.start();
    }
}
