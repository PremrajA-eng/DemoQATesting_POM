package OpenQA.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import qaWebElement.pageobjects.BasePage;

public class BaseTest {
	
	WebDriver driver;
	
	public WebDriver initializeDriver()
	{	
	      driver = new ChromeDriver();
	      return driver;
}
	public BasePage LaunchApplication() {
		driver=initializeDriver();
		driver.manage().window().maximize();
		BasePage basepage= new BasePage(driver);
		basepage.openURL();
		return basepage;
	}
	

}
