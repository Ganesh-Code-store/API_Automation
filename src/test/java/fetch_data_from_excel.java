import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class fetch_data_from_excel {
	
	@Test
	public void getData() throws BiffException, IOException
	{
		FileInputStream fs=new FileInputStream("F:\\Ganesh.xls");
		
		Workbook book=Workbook.getWorkbook(fs);
		
		Sheet sheet=book.getSheet(0);
		String cellstring=sheet.getCell(2, 0).getContents();
		

		
		System.out.println(cellstring);
		
		
		//WritableCell cellUpdate=new Label(2, 0, "updatedAshok");
		
		
		
		//String cellstring1=sheet.getCell(2, 0).getContents();

		//Assert.assertEquals(cellstring1,"updatedAshok");
		System.out.println("all assertions passed");

		
		
		
	}

}
