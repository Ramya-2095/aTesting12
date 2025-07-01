package pom;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.SelectableChannel;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestScript {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./TestData/commondata.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String url = prop.getProperty("url1");
		FileInputStream fis1=new FileInputStream("./TestData/TestScriptdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis1);
		String FN = wb.getSheet("Sheet2").getRow(1).getCell(0).getStringCellValue();
		String SN = wb.getSheet("Sheet2").getRow(1).getCell(1).getStringCellValue();
		String day = wb.getSheet("Sheet2").getRow(1).getCell(2).getStringCellValue();
		System.out.println(day);
		String mobileno = wb.getSheet("Sheet2").getRow(1).getCell(5).getStringCellValue();
		String password = wb.getSheet("Sheet2").getRow(1).getCell(6).getStringCellValue();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		Facebookwelcomepage wp=new Facebookwelcomepage(driver);
		wp.getCreateaccountbutton().click();
		Facebookregisterpage RP=new Facebookregisterpage(driver);
		RP.getFirstnameTF().sendKeys(FN);
		RP.getLastnameTF().sendKeys(SN);
		RP.getDayTF().sendKeys(day);
		//WebElement day = driver.findElement(By.id("day"));
				
		//Select opt=new Select(day);
		//opt.selectByIndex(5);
		WebElement month = driver.findElement(By.id("month"));		
		Select opt1=new Select(month);
		opt1.selectByIndex(5);
		WebElement year = driver.findElement(By.id("year"));
		Select opt3=new Select(year);
		opt3.selectByValue("2025");
		RP.getFemaleradiobutton().click();
		RP.getMobilenumberTF().sendKeys(mobileno);
		RP.getPasswordTF().sendKeys(password);
		RP.getSignupbutton().click();
		String time = LocalDateTime.now().toString().replace(":", "-");
		TakesScreenshot TS=(TakesScreenshot) driver;
		File temp = TS.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshots/"+time+".png");
		FileHandler.copy(temp, dest);
		




	}

}
