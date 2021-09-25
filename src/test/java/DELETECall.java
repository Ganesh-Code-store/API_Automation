import org.testng.annotations.Test;

public class DELETECall {
	
	
	@Test
	public void deleteCall()
	{
		String responsebody=BaseClass.request("DELETE","https://reqres.in/api/users/2");
		System.out.println("Response body----->");
		
		if(responsebody.isBlank())
		{
			
			System.out.println("No response returned");
			
		}
		else
		{
			System.out.println(responsebody);
				
		}
		
		
		
	}

}
