import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GETCall {
	
	
	
	@Test
	public void testGET()
	{
		RestAssured.baseURI="https://reqres.in/api";
		
		RequestSpecification httpreq=RestAssured.given();
		
		Response res=httpreq.request(Method.GET,"/users?page=2");
		
		
		int statuscode=res.statusCode();
		
		Assert.assertEquals(statuscode, 200);
		
		System.out.println("Status code :"+res.statusCode());
		
		System.out.println("Complete response :"+res.getBody().asString());
		

	}

}
