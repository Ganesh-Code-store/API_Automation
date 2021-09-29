import java.io.FileNotFoundException;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class DELETECall {
	
	
	@Test
	public void deleteCall() throws FileNotFoundException
	{
		Response responsebody=BaseClass.request("DELETE","https://reqres.in/api/users/2");
		System.out.println("Response body----->");
		
		
		Assert.assertNotEquals(responsebody.asString()," ");
		
		
		System.out.println(responsebody.asString());
		
		
		
		
		
		
	}

}
