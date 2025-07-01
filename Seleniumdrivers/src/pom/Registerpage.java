package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registerpage {
	@FindBy(id="gender-female")
	private WebElement femaleRadiobutton;
	@FindBy(id="FirstName")
	private WebElement firstnametextfiedElement;
	@FindBy(id="LastName")
	private WebElement lastnametextfield;
	@FindBy(id="Email")
	private WebElement emailTextfield;
	@FindBy(id="Password")
	private WebElement passwordTxtfield;
	@FindBy(id="ConfirmPassword")
	private WebElement confirmpassordtextfield;
	@FindBy(id="register-button")
	private WebElement registerbutton;
	public Registerpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver,this);
		}
	public WebElement getFemaleRadiobutton() {
		return femaleRadiobutton;
		}
	public WebElement getFirstnametextfiedElement() {
		return firstnametextfiedElement;
	}
	public WebElement getLastnametextfield() {
		return lastnametextfield;
	}
	public WebElement getEmailTextfield() {
		return emailTextfield;
	}
	public WebElement getPasswordTxtfield() {
		return passwordTxtfield;
	}
	public WebElement getConfirmpassordtextfield() {
		return confirmpassordtextfield;
	}
	public WebElement getRegisterbutton() {
		return registerbutton;
	}

	
}
