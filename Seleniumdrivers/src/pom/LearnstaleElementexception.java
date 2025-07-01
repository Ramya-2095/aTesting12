package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnstaleElementexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.myntra.com/");
		//WebElement SearchTF = driver.findElement(By.xpath("//input[@placeholder=\"Search for products, brands and more\"]"));
		//SearchTF.sendKeys("mobiles",Keys.ENTER);
		//SearchTF.sendKeys("shoes");
		Myntrapage mp=new Myntrapage(driver);
		mp.getSearchTf().sendKeys("mobiles",Keys.ENTER);
		mp.getSearchTf().sendKeys("shoes");
	}

}
