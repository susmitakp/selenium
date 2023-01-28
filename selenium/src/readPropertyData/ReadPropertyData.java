package readPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("./data/config.properties");// provide path of property file
	Properties	 prop = new Properties(); 
	prop.load(fis);// used read the file
	 String data = prop.getProperty("Browser");
	 System.out.println(data);
	

	}

}
