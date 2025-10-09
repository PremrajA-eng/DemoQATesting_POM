package qaWebElement.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBoxPage extends BasePage{
	WebDriver driver;
	   public TextBoxPage(WebDriver driver) {
		super(driver);
		this.driver=driver;	   
		PageFactory.initElements(driver, this);
	}
	   @FindBy(xpath="//h1[normalize-space()='Text Box']")
        WebElement conftxtboxpage;
	   
	   
	   public String confirmTextBoxPage() {
		   String actualtext_textbox=conftxtboxpage.getText();
		   return actualtext_textbox;
	   }
}
