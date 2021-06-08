package testngPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class FirstTestNGFile {
  
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
    String driverPath = "F:\\\\Praven\\\\Selenium\\\\Gecko Driver\\\\geckodriver.exe";
    public WebDriver driver ; 
    
    @BeforeTest
    public void launchBrowser() {
    	
	  System.out.println("launching firefox browser"); 
	  System.setProperty("webdriver.gecko.driver", driverPath);
	  driver = new FirefoxDriver();
	  driver.get(baseUrl);
	  
    }
    
	 @Test
	 public void verifyHomepageTitle() {
       
      String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
      
	 }
	 
      @AfterTest
      public void closeBrowser() {
    	  
    	  driver.close();
    	  
      }
     
 
}
