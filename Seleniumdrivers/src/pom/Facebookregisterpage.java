package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebookregisterpage {
	@FindBy(name="firstname")
	private WebElement firstnameTF;
	@FindBy(name="lastname")
	private WebElement lastnameTF;
	@FindBy(id="day")
	private WebElement dayTF;
	@FindBy(id="month")
	private WebElement monthTF;
	@FindBy(id="year")
	private WebElement yearTF;
	@FindBy(xpath = "//input[@id='sex']")
	private WebElement femaleradiobutton;
	@FindBy(name = "reg_email__")
	private WebElement mobilenumberTF;
	@FindBy(id="password_step_input")
	private WebElement passwordTF;
	@FindBy(name="websubmit")
	private WebElement signupbutton;
	public Facebookregisterpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	public WebElement getFirstnameTF() {
		return firstnameTF;
	}
	public WebElement getLastnameTF() {
		return lastnameTF;
	}
	public WebElement getDayTF() {
		return dayTF;
	}
	public WebElement getMonthTF() {
		return monthTF;
	}
	public WebElement getYearTF() {
		return yearTF;
	}
	public WebElement getFemaleradiobutton() {
		return femaleradiobutton;
	}
	public WebElement getMobilenumberTF() {
		return mobilenumberTF;
	}
	public WebElement getPasswordTF() {
		return passwordTF;
	}
	public WebElement getSignupbutton() {
		return signupbutton;
	}

}
