import org.testng.Assert;
import org.testng.annotations.Test;

public class PUTCall extends BaseClass{
	
	@Test
	public void testPut()
	{
		String responsebody=BaseClass.request("PUT", "https://reqres.in/api/users/2");
		
		
		System.out.println(responsebody);
		
		
		
		
		
		
		
		
	}


}
