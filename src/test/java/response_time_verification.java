
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class response_time_verification {
	
	@Test
	public void bodytest() throws FileNotFoundException
	{
		
		Response testres=BaseClass.request("POST","https://dummy.restapiexample.com/create");
		
		
			Assert.assertEquals(testres.statusCode(), 405);
			Assert.assertTrue(testres.getTimeIn(TimeUnit.SECONDS)<3.12);
			
			System.out.println(testres.getTimeIn(TimeUnit.SECONDS));
			
			System.out.println(testres.statusCode());
			
	}

}