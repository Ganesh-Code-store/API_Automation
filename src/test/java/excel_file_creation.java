import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

@Test
public class excel_file_creation {
	
	@Test
	public void createExcel() throws IOException, RowsExceededException, WriteException
	{
		WritableWorkbook book=Workbook.createWorkbook(new File("F:\\Ganesh.xls"));
		WritableSheet sheet=book.createSheet("Ganesh_data",1);
		
		
		WritableCell cell1=new Label(0, 0, "Ganesh");
		WritableCell cell2=new Label(1, 0, "Ganesh");
		WritableCell cell3=new Label(2, 0, "Ganesh");
		
		sheet.addCell(cell1);
		sheet.addCell(cell2);
		sheet.addCell(cell3);
		
		WritableSheet sheet1=book.createSheet("Ganesh_data1s",2);
		
		book.write();
		book.close();
		
		
		
		
		
	}

}
