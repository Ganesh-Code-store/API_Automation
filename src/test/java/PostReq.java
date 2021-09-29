import java.io.FileNotFoundException;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class PostReq extends BaseClass {

	@Test
	public void postcall() throws FileNotFoundException {
		
		
		Response res=BaseClass.request("POST","https://reqres.in/api/users");
		
		
		  
        
		System.out.println(res.asString());
		

	}

}
