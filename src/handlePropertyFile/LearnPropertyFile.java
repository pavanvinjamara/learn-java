package src.handlePropertyFile;

import java.io.*;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class LearnPropertyFile {
    public static void main(String[] args) throws IOException {
        File file = new File("./src/handlePropertyFile/dbConfig.properties");

        if(!file.exists()){
            file.createNewFile();
            System.out.println("absent");
        }else{
            System.out.println("Present");
        }

//      To create properties in property file
        Properties prop = new Properties();
//        creating properties
        prop.setProperty("url", "localhost");
        prop.setProperty("username", "pavan@323");
        prop.setProperty("password", "hyyr123");

//        To Add properties in file
        FileOutputStream fos = new FileOutputStream(file);
        prop.store(fos, "New File is created");

//        To Read file
        FileInputStream fis = new FileInputStream(file);
        prop.load(fis);

//        To load keys
        Set<String> keys = prop.stringPropertyNames();
        System.out.println(keys);
//        for we can use keySet() || prop.keys

//        For values

        Collection<Object> values = prop.values();
        System.out.println(values);

//        For key, we need to get value
//        If we don't have key we give default value
            System.out.println(prop.getProperty("time", "default time"));

            System.out.println(prop);
//            we can also iterate using foreach loop
            for(Object key: prop.keySet()){
                System.out.println(key+ " > "+ prop.getProperty((String) key));
            }
            Set<Map.Entry<Object, Object>> data = prop.entrySet();
            for(Map.Entry<Object, Object> entry:data){
                System.out.println(entry.getKey() +" > "+ entry.getValue() );
            }

//            Update the property
//         first load the old properties using prop.load and using
//        setProperty we can update

//        Remove property
        prop.remove("username");


    }
}
