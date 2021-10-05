import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class form_data extends BaseClass {
	
	@Test
	public void form_data_test()
	{
		RequestSpecification rs=RestAssured.given();
		rs.formParam("username", "user@site.com");
		rs.formParam("password", "password");
		
		
		response=rs.post("https://httpbin.org/post");
		
		//System.out.println(response.asString());
		
		
		JsonPath jp=response.jsonPath();
		
		
		
		String user=jp.get("form.username");
		String password=jp.get("form.password");
		
		
		Assert.assertEquals(user, "user@site.com");
		Assert.assertEquals(password, "password");
		
		
		
		System.out.println(user);
		System.out.println(password);
		
		System.out.println("all assertions passed");

		
	}

}
