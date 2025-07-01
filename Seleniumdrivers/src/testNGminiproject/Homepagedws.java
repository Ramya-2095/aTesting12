package testNGminiproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepagedws {
	
	@FindBy(partialLinkText = "Gift Cards")
	private WebElement giftcardslink;
	@FindBy(partialLinkText = "Apparel & Shoes")
	private WebElement apparellink;
	@FindBy(partialLinkText = "Digital downloads")
	private WebElement digitallink;
	@FindBy(linkText = "Log out")
	private WebElement logoutlink;
	
	public Homepagedws(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getGiftcardslink() {
		return giftcardslink;
	}
	public WebElement getApparellink() {
		return apparellink;
	}
	public WebElement getDigitallink() {
		return digitallink;
	}
	public WebElement getLogoutlink() {
		return logoutlink;
	}
	
	
	

}
