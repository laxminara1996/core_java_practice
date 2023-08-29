package in.lakshmi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class DataApp {
public static void main(String[] args) throws Exception {
FileInputStream fis = new FileInputStream("database.properties");	
Properties p = new Properties();
p.load(fis);

System.out.println(p.getProperty("username"));
	System.out.println(p.getProperty("pwd"));
	fis.close();
}
}
