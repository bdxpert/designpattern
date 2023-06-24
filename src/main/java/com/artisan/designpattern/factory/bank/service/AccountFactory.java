package com.artisan.designpattern.factory.bank.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class AccountFactory {
    private AccountFactoryInterface factory;

    public AccountFactory(String path) {
        try {
            Properties prop = new Properties();
            // load the properties file
            prop.load(new FileInputStream(path));
            // get the property value
            String environment = prop.getProperty("environment");
            if (environment.equals("production")) {
                factory = new ProductionFactory();
            } else if (environment.equals("test")) {
                factory = new MockFactory();
            } else {
                System.out.println("environment property not set correctly");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public AccountFactoryInterface getFactoryInstance() {
        return factory;
    }
}
