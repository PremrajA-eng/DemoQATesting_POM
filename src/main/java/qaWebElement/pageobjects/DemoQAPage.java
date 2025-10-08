package qaWebElement.pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQAPage {
	WebDriver driver;
	public DemoQAPage(WebDriver driver) {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h5[normalize-space()='Elements']")
	WebElement elementtab;
	
	public ElementsPage clickonElementSection() {
		WebDriverWait wt= new WebDriverWait(driver, Duration.ofSeconds(10));
		wt.until(ExpectedConditions.visibilityOfElementLocated((By) elementtab)).click();
		ElementsPage elementpage=new ElementsPage(driver);
		return elementpage;
	}
	
	
	public void openURL() {
		driver.get("https://demoqa.com/");
	}

}
