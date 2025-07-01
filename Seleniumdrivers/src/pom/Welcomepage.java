package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcomepage {

	
		//declaration
		@FindBy(linkText = "Register")
		private WebElement registerLink;
		//intialization
		public Welcomepage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			PageFactory.initElements(driver, this);
		}
		//getters
		public WebElement getRegisterLink() {
			return registerLink;
		}
		
		
	}


