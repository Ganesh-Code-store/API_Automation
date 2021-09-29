import java.io.FileNotFoundException;

import org.testng.annotations.Test;

public class response_size_verification extends BaseClass {
	
	@Test
	public void responseSize() throws FileNotFoundException
	{
		
		response=BaseClass.request("GET", "https://dummy.restapiexample.com/create");
		
		System.out.println(response.getBody().asString().length());
		
		
		
	}

}
