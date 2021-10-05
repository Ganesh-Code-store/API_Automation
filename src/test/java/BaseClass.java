import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class BaseClass<RequestSpecsification> {

	static RestAssured req = new RestAssured();
	public static Response response;

	public static String methodOfApi="";
	public static String urlOfApi="";
	
	
	@Test
	public static Response request(String method, String url) throws FileNotFoundException {
		RequestSpecification req = (RequestSpecification) RestAssured.given();
		if (method.equalsIgnoreCase("GET")) {
			Response res = req.request(Method.GET, url);
			store(res);
			methodOfApi=method;
			urlOfApi=url;
			

			return res;

		} else if (method.equalsIgnoreCase("POST")) {
			Response res = req.request(Method.POST, url);
			store(res);
			methodOfApi=method;
			urlOfApi=url;

			return res;

		} else if (method.equalsIgnoreCase("PUT")) {
			Response res = req.request(Method.PUT, url);
			store(res);
			methodOfApi=method;
			urlOfApi=url;

			return res;

		} else if (method.equalsIgnoreCase("DELETE")) {
			Response res = req.request(Method.DELETE, url);
			store(res);
			methodOfApi=method;

			urlOfApi=url;

			return res;

		} else {

			return null;

		}

	}
	
	
	
	public static void createExcel(Response response2) throws IOException, RowsExceededException, WriteException
	{
		String code =Integer.toString(response2.statusCode());

		String url1 = BaseClass.urlOfApi;

		System.out.println("url------------->"+url1);
		
		String method1 = BaseClass.methodOfApi;

		System.out.println("Method----------->"+method1);
		
		
		
		WritableWorkbook book=Workbook.createWorkbook(new File("F:\\RestAssured\\Excel files\\File"+Math.ceil(Math.random()*100)+".xls"));
		WritableSheet sheet=book.createSheet("api_reports",1);
		
		
		//Row headings
		WritableCell cell1=new Label(0, 0, "url");
		WritableCell cell2=new Label(1, 0, "method");
		WritableCell cell3=new Label(2, 0, "code");
		WritableCell cell4=new Label(3, 0, "Response");

		//first row of record
		WritableCell cell5=new Label(0, 1, url1);
		WritableCell cell6=new Label(1, 1, method1);
		WritableCell cell7=new Label(2, 1, code);
		WritableCell cell8=new Label(3, 1, response.toString());
		
		
		
		//adding cells of headings	
		sheet.addCell(cell1);
		sheet.addCell(cell2);
		sheet.addCell(cell3);
		sheet.addCell(cell4);
		

		//adding cells of first record
		sheet.addCell(cell5);
		sheet.addCell(cell6);
		sheet.addCell(cell7);
		sheet.addCell(cell8);
		
		book.write();
		book.close();
	}
	
	public static void store(Response response) throws FileNotFoundException {
		PrintWriter out = new PrintWriter("F:\\RestAssured\\src\\main\\resources\\responses.txt");
		out.append(response.getBody().prettyPrint());
		out.close();
	}

	public static void GET(String url) throws FileNotFoundException {
		Response res = req.request(Method.GET, url);
		store(res);
		System.out.println("Response using GET http method");

		System.out.println(res.getBody().asString());

	}

	public static void POST(String url) throws FileNotFoundException {
		Response res = req.request(Method.POST, url);
		store(res);

		System.out.println("Response using POST http method");
		System.out.println(res.getBody().asString());

	}

	public static void PUT(String url) throws FileNotFoundException {
		Response res = req.request(Method.PUT, url);
		store(res);
		System.out.println("Response using PUT http method");

		System.out.println(res.getBody().asString());
	}

	public static void DELETE(String url) throws FileNotFoundException {
		Response res = req.request(Method.DELETE, url);
		store(res);
		System.out.println("Response using DELETE http method");

		System.out.println(res.getBody().asString());
	}

	public static void runAllMethods(String url) throws FileNotFoundException {

		GET(url);
		POST(url);
		PUT(url);
		DELETE(url);

	}
}
