package Util;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import static Util.AbstractLocations.PROP_FILE;

public class PropertyLoader {
    public static final String PROP_FILE = AbstractLocations.PROP_FILE.getValue();

    public static String loadProperty(String name){
        String value = "";
        Properties prop = new Properties();
        try{
            prop.load(new FileInputStream(PROP_FILE));
        }catch (IOException e){
            e.printStackTrace();
        }
        if (name != null){
            value = prop.getProperty(name);
        }
        return value;
    }
}
