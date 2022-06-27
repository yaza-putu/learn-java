package javaclass;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesClass {
    public static void main(String[] args) {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("app.properties"));
            System.out.println(properties.getProperty("database.port").toString());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
