package datadriventesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assign2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("./TestData/commondata.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String url = prop.getProperty("url");
		//reading data from excel
		FileInputStream fis1=new FileInputStream("./TestData/TestScriptdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis1);
		String FName = wb.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
		String lastname = wb.getSheet("Sheet1").getRow(1).getCell(4).getStringCellValue();
		String email = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		String pw = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		String cpw = wb.getSheet("Sheet1").getRow(1).getCell(5).getStringCellValue();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("//input[@id='gender-female']")).click();
		driver.findElement(By.id("FirstName")).sendKeys(FName);
		driver.findElement(By.id("LastName")).sendKeys(lastname);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pw);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(cpw);
		driver.findElement(By.id("register-button")).click();
		String time = LocalDateTime.now().toString().replace(":", "-");
		TakesScreenshot Ts=(TakesScreenshot) driver;
		File temp = Ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshots/"+time+".png");
		FileHandler.copy(temp, dest);
		
		
		
		}

}
