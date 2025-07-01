package Assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assign3 {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.myntra.com/");
	driver.manage().window().maximize();
	String url = driver.getCurrentUrl();
	System.out.println(url);
	Dimension size = driver.manage().window().getSize();
	System.out.println(size.getHeight());
	System.out.println(size.getWidth());
	driver.manage().window().setSize(new Dimension(750, 900));
	
}
}
