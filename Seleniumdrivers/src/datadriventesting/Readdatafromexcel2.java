package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readdatafromexcel2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("./TestData/TestScriptdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		double price = wb.getSheet("Sheet1").getRow(1).getCell(6).getNumericCellValue();
		System.out.println(price);
		boolean status = wb.getSheet("Sheet1").getRow(1).getCell(7).getBooleanCellValue();
		System.out.println(status);
		LocalDateTime time = wb.getSheet("Sheet1").getRow(1).getCell(8).getLocalDateTimeCellValue();
		System.out.println(time);
		System.out.println(time.getDayOfMonth());
		System.out.println(time.getMonth());
		System.out.println(time.getYear());


		

		
				}

}
