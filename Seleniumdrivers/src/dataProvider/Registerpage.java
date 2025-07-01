package dataProvider;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registerpage {
	@FindBy(linkText = "Register")
	private WebElement registerlink;
	@FindBy(id="FirstName")
	private WebElement firstnameTF;
	@FindBy(id="LastName")
	private WebElement lastnameTF;
	@FindBy(id="Email")
	private WebElement emailTF;
	@FindBy(id="Password")
	private WebElement passwordTF;
	@FindBy(id="ConfirmPassword")
	private WebElement confirmPWTF;
	
	public Registerpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getRegisterlink() {
		return registerlink;
	}

	public WebElement getFirstnameTF() {
		return firstnameTF;
	}

	public WebElement getLastnameTF() {
		return lastnameTF;
	}

	public WebElement getEmailTF() {
		return emailTF;
	}

	public WebElement getPasswordTF() {
		return passwordTF;
	}

	public WebElement getConfirmPWTF() {
		return confirmPWTF;
	}
	

}
