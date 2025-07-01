package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearngetsize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver	driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://demowebshop.tricentis.com/");
      Dimension size = driver.findElement(By.xpath("//input[@id='small-searchterms']")).getSize();
      System.out.println(size);
      System.out.println( size.getHeight());
      System.out.println(size.getWidth());

}
}
