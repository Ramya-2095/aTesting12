package pom;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScriptdemoweb {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("./TestData/commondata.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String url = prop.getProperty("url");
		FileInputStream fis1=new FileInputStream("./TestData/TestScriptdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis1);
		String FN = wb.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
		String LN = wb.getSheet("Sheet1").getRow(1).getCell(4).getStringCellValue();
		String email = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		String PW = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		String CPW = wb.getSheet("Sheet1").getRow(1).getCell(5).getStringCellValue();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		Welcomepage wp=new Welcomepage(driver);
		wp.getRegisterLink().click();
		Registerpage RP=new Registerpage(driver);
		RP.getFemaleRadiobutton().click();
		RP.getFirstnametextfiedElement().sendKeys(FN);
		RP.getLastnametextfield().sendKeys(LN);
		RP.getEmailTextfield().sendKeys(email);
		RP.getPasswordTxtfield().sendKeys(PW);
		RP.getConfirmpassordtextfield().sendKeys(CPW);
		RP.getRegisterbutton().click();


				
	}

}
