import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class basic_auth_using_headers extends BaseClass {
	
	@Test
	public void basicHeader()
	{
	
		RequestSpecification rs=RestAssured.given();
		rs.header("Authorization","Basic cG9zdG1hbjpwYXNzd29yZA==");
		
		response=rs.get("https://postman-echo.com/basic-auth");
		System.out.println("Status code :"+response.statusCode());

		Assert.assertEquals(response.statusCode(), 200);
		
		System.out.println(response.asString());
		
		JsonPath jp=response.jsonPath();
		
		Object status=jp.get("authenticated");
		
		Assert.assertEquals(status.toString(), "true");
		System.out.println("All assertions passed");

		
		
		
		
	}

}
