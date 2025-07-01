package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class population {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.worldometers.info/world-population/");
			String population = driver.findElement(By.xpath("//div[text()='Births today']/..//span[@rel='births_today']")).getText();
			Thread.sleep(20000);
			System.out.println(population);
			driver.close();
			
			}
			


	}


