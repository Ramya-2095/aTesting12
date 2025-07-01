package pomassign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpagefacebook {
@FindBy(id="email")
private WebElement emailTF;
@FindBy(id="pass")
private WebElement passwordTF;
@FindBy(name="login")
private WebElement loginbutton;
public Loginpagefacebook(WebDriver driver) {
PageFactory.initElements(driver, this);
}
public WebElement getEmailTF() {
	return emailTF;
}
public WebElement getPasswordTF() {
	return passwordTF;
}
public WebElement getLoginbutton() {
	return loginbutton;
}

}
