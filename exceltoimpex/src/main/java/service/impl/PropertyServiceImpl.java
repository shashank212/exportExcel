package service.impl;

import service.PropertyService;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyServiceImpl implements PropertyService {

    @Override
    public String fetchStringProperty(String key) throws IOException {
        Properties props = fetchPropertyFile();
        String value = props.getProperty(key);
        return value;
    }


    @Override
    public String fetchProperty(String key) throws IOException {
        Properties props = fetchPropertyFile();
        String value = props.getProperty(key);
        return value;
    }


    public Properties fetchPropertyFile() throws IOException {
        Properties props = new Properties();

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("C:\\DeloittePocs\\exceltoimpex\\src\\main\\java\\properties\\main.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        props.load(fis);
        return props;
    }
}
