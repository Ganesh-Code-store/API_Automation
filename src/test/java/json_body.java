import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class json_body extends BaseClass{
	
	
	@Test
	public void jsonbodytest()
	{
		RequestSpecification rs=RestAssured.given();
		
		
		
		HashMap js=new HashMap();
		
		js.put("name", "morpheus");
		
		js.put("job", "plumbers");
		
		
		rs.body(js);
		
		//rs.body(js.toJSONString());
		
		
		response=rs.post("https://reqres.in/api/users");
		
		System.out.println(response.asString());
		
		
		
	}

}
