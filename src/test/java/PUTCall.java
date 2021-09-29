import java.io.FileNotFoundException;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class PUTCall extends BaseClass{
	
	@Test
	public void testPut() throws FileNotFoundException
	{
		Response responsebody=BaseClass.request("PUT", "https://reqres.in/api/users/2");
		
		
		System.out.println(responsebody);
		
		
		
		
		
		
		
		
	}


}
