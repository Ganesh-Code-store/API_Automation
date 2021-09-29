import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.response.Response;

public class BasicAuth extends BaseClass {
	
	
	@Test
	public void get()
	{
		


		PreemptiveBasicAuthScheme auth=new PreemptiveBasicAuthScheme();
		
		auth.setUserName("postman");
		auth.setPassword("password");
		
		req.authentication=auth;
		
		Response Res=req.get("https://postman-echo.com/basic-auth");
		
		System.out.println("Response of api------------------>");
		System.out.println(Res.asString());
		
		Assert.assertEquals(Res.statusCode(), 200);
		
	
	}
	
	

}
