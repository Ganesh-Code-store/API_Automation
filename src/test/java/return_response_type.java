import java.io.FileNotFoundException;

import org.junit.Assert;
import org.testng.annotations.Test;

public class return_response_type extends BaseClass {
	
	@Test
	public void resTest() throws FileNotFoundException
	{
		response=BaseClass.request("GET", "https://reqres.in/api/users?page=2");
		//BaseClass.store(response);
		Assert.assertTrue(response.contentType().contains("json"));
	    String arr[]=response.contentType().split("/");
	    
	    System.out.println(arr[1].replaceAll("; charset=utf-8", " "));
	    

	}

}
