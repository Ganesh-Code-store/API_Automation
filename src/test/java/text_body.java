import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;

public class text_body extends BaseClass{
	
	@Test
	public void textbody()
	{
		RequestSpecification sp=RestAssured.given();
		
		String text="UserName Ganesh DeviceId 46f9f070 DeviceModel Android Password Test@1 Location DeviceToken version 1445";
		
		
		sp.body(text);
		
		response=sp.post("https://postman-echo.com/post");
		
		JsonPath json=response.jsonPath();
		
	
		String textresponse=response.asString();
		
		Assert.assertEquals(json.get("data"), text);
		System.out.println(response.asString());
		
		System.out.println("all assertions passed");

		
	}

}
