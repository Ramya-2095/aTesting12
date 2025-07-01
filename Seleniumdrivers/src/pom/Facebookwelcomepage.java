package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebookwelcomepage {
	@FindBy(linkText = "Create new account")
	private WebElement createaccountbutton;
	public Facebookwelcomepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public WebElement getCreateaccountbutton() {
		return createaccountbutton;
	}
	

}
