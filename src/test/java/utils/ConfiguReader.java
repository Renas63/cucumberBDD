package utils;

import org.openqa.selenium.Keys;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfiguReader {

    private  static Properties  properties;

    static {
        String path="configuration.properties";
        try {
            //FileInputStream will open the file
            FileInputStream input = new FileInputStream(path);
            properties= new Properties();
            // load method will store every value from properties file to the Properties object
            properties.load(input);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static String getProperty(String key){
       return properties.getProperty(key);
    }
}
