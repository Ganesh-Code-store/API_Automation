import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class test_excel_utility extends BaseClass {

	@Test
	public void testUtility() throws RowsExceededException, WriteException, IOException {
		
		response = BaseClass.request("GET", "https://reqres.in/api/users?page=2");
		
		
		
		BaseClass.createExcel(response);

	}

}
