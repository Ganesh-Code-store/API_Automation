import java.io.FileNotFoundException;

import org.testng.annotations.Test;

public class run_all_methods extends BaseClass {
	
	@Test
	public void runall() throws FileNotFoundException
	{
		
		BaseClass.runAllMethods("https://reqres.in/api/users?page=2");
		//System.out.println(response.statusCode());
		
	}

}
