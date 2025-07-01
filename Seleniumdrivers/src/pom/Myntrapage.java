package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Myntrapage {
	@FindBy(xpath="//input[@placeholder=\"Search for products, brands and more\"]")
	private WebElement SearchTf;
	public Myntrapage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getSearchTf() {
		return SearchTf;
	}
	
	
}
