package com.selenium1.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

    private static PropertyReader propertyReader;
    private Properties properties;

    private PropertyReader()
    {
        properties = new Properties();
        try {
            FileInputStream inputStream = new FileInputStream("src/main/java/com/selenium1/config/config.properties");
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static PropertyReader getInstance() {
        if (propertyReader == null) {
            propertyReader = new PropertyReader();
        }
        return propertyReader;
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }


}
