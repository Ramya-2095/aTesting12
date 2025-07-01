package Assignment;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assisn4 {
public static void main(String[] args) throws MalformedURLException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	//driver.navigate().to("https://www.ajio.com/");
	driver.navigate().to(new URL("https://www.ajio.com/"));
	driver.navigate().back();
	Thread.sleep(1000);
	driver.navigate().forward();
	Thread.sleep(1000);
	String title = driver.getTitle();
	System.out.println(title);
	if(title.equals(title)) {
		System.out.println("webpage is displayed");
	}
	else {
	System.out.println("webpage is not displayed");
	}
	driver.manage().window().setPosition(new Point(350, 270));
	driver.manage().window().setSize(new Dimension(400, 300));
}
}
