package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign1demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demowebshop.tricentis.com/");
        driver.findElement(By.id("vote-poll-1")).click();
        Alert msg = driver.switchTo().alert();
        String txt = msg.getText();
        System.out.println(txt);
        msg.accept();;

	}

}
