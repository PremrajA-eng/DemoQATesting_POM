package OpenQA.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import qaWebElement.pageobjects.DemoQAPage;

public class BaseTest {
	
	WebDriver driver;
	
	public WebDriver initializeDriver(){	
	      driver = new ChromeDriver();
	
	return driver;
}
	public DemoQAPage LaunchApplication() {
		driver=initializeDriver();
		DemoQAPage demoqapage= new DemoQAPage(driver);
		demoqapage.openURL();
		return demoqapage;
	}
	

}
