package collections.Map.Properties;

import java.util.*;
import java.io.*;

public class PropertiesExample {
    public static void main(String[] args) throws Exception{
        Properties p = new Properties();
        FileInputStream fis = new FileInputStream("collections/Map/Properties/abc.properties");

        p.load(fis);

        System.out.println(p);

        String s = p.getProperty("venki");
        System.out.println(s);

        p.setProperty("nag", "8888");
        System.out.println(p);

        FileOutputStream fos = new FileOutputStream("collections/Map/Properties/abc.properties");

        p.store(fos, "Updated by me :)");
    }
}
