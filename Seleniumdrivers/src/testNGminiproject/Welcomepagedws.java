package testNGminiproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcomepagedws {
	@FindBy(linkText = "Log in")
	private WebElement loginlink;
	public Welcomepagedws(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getLoginlink() {
		return loginlink;
	}
	

}
