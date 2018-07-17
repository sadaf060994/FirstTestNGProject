package firsttestngproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class FirstTestNGFile {
	public String baseUrl = "http://10.0.1.86/tatoc";
    String driverPath = "S:\\Workspace\\FirstTestNGProject\\lib\\chromedriver1.exe";
    public WebDriver driver; 
	
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", driverPath);
	  driver = new ChromeDriver();
	  driver.get(baseUrl);
	  String expectedTitle = "Welcome - T.A.T.O.C";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
   //   driver.close();
  }
}
