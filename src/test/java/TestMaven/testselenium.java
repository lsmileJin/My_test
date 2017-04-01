package TestMaven;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class testselenium {
	
	@Test
    public void startWebDriver(){


        /* The following code is for the Chrome Driver
           You also need to download the ChromeDriver executable
           https://sites.google.com/a/chromium.org/chromedriver/
         */
		String currentDir = System.getProperty("user.dir");
		//System.out.println(currentDir);
		String chromeDriverLocation = currentDir + "/tools/chromedriver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverLocation);
		
		
		//String IEDriverLocation = currentDir + "/tools/IEDriverServer.exe";
        //System.setProperty("webdriver.ie.driver", IEDriverLocation);
		// WebDriver driver = new InternetExplorerDriver();

        //If you add the folder with chromedriver.exe to the path then you only need the following line
        // and you don't need to set the property as listed in the 3 lines above
        // e.g. D:\Users\Alan\Documents\github\startUsingSeleniumWebDriver\tools\chromedriver
       WebDriver driver = new ChromeDriver();
      
        driver.navigate().to("http://www.maiziedu.com/");

       // Assert.assertTrue("title should start differently",driver.getTitle().startsWith("Selenium Simplified"));
        
        //driver.quit();
    }
	
	
	

}
	