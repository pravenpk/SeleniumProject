package sampleCodePackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MySeleniumClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Selenium Tutorials");
			
			System.setProperty("webdriver.gecko.driver", "F:\\Praven\\Selenium\\Gecko Driver\\geckodriver.exe");
	        
			WebDriver driver = new FirefoxDriver();
			driver.navigate().to("http://demo.guru99.com/test/newtours/");
			
			driver.manage().window().maximize();
			
			//Getting title of the page
			String titleOfThePage = driver.getTitle();
			System.out.println("Title of the page:"+titleOfThePage);
			
			//Sending input to textbox
			WebElement userNameTextBox = driver.findElement(By.name("userName"));
			userNameTextBox.sendKeys("Praven17");
			
			//Clicking button
			WebElement submitButton = driver.findElement(By.name("submit"));
			submitButton.click();
			
			driver.navigate().to("http://demo.guru99.com/test/newtours/register.php");
			driver.navigate().back();
			
			
			driver.switchTo().alert().accept();
			
			WebDriverWait ww = new WebDriverWait(driver, 10);
			ww.until(ExpectedConditions.visibilityOfElementLocated(By.name("userName")));

			
			Thread.sleep(5000);
			driver.close();
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		
	}

}
