package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TestProperties {
    private final java.util.Properties properties = new java.util.Properties();

    private static TestProperties INSTANCE = null;

    private TestProperties(){
        try {
            properties.load(new FileInputStream(new File("./" + System.getProperty("environment") + ".properties")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static TestProperties getInstance() {
        if (INSTANCE == null){
            INSTANCE = new TestProperties();
        }
        return INSTANCE;
    }

    public java.util.Properties getProperties() {
        return properties;
    }
}
