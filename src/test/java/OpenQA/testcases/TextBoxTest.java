package OpenQA.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import qaWebElement.pageobjects.BasePage;
import qaWebElement.pageobjects.ElementsPage;
import qaWebElement.pageobjects.TextBoxPage;

public class TextBoxTest extends BaseTest {
	@Test
	public void confJumponTextBoxPage() {
		//BasePage basepage=LaunchApplication();
		LaunchApplication();		
		ElementsPage elementpage=basepage.clickonElementSection();
		TextBoxPage textboxpage=elementpage.checkTextBoxElement();
	    String actualtext_textbox=textboxpage.confirmTextBoxPage();
	    Assert.assertTrue(actualtext_textbox.equalsIgnoreCase("Text Box"));
	}
}
