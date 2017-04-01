package TestMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class QC_cookie {
	String currentDir = System.getProperty("user.dir");
	String IEDriverLocation = currentDir + "/tools/IEDriverServer.exe";
   @Test
	public void getcookie(){
		 System.setProperty("webdriver.ie.driver", IEDriverLocation);
		 WebDriver driver = new InternetExplorerDriver();
		 driver.get("http://www.maiziedu.com/");
		// driver.switchTo().frame("kfiframe");
		 try {
			Thread.sleep(3000);
			 driver.findElement(By.xpath("html/body/div[6]/div/div/div[2]/div/a[2]")).click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 //driver.findElement(By.partialLinkText("登录"));
		 driver.findElement(By.id("id_account_l")).sendKeys("zd101344001@163.com");;
		 driver.findElement(By.id("id_password_l")).sendKeys("love101344001");
		 driver.findElement(By.id("login_btn")).click();
	}
}
