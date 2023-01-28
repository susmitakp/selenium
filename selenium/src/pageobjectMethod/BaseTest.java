package pageobjectMethod;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class BaseTest  implements  IAutoConstant{
    static WebDriver driver ;
    public void openBrowser() throws IOException 
    {
    	Flib flib = new Flib();
    String browserValue = Flib.readPropertyData(null, null);
    
	
	}

}
