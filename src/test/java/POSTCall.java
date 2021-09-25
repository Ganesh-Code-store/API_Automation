import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class POSTCall {

	@Test
	public void postCall() {
 
		//RestAssured.baseURI = "https://reqres.in";

		RequestSpecification httpreq = RestAssured.given();

		
		JSONObject json=new JSONObject();
		json.put("name", "john");
		json.put("job", "SE");
		
		httpreq.body(json.toString());
		
		Response res = httpreq.request(Method.POST, "https://reqres.in/api/users");
		
		
		int statuscode=res.statusCode();
		
		
		Assert.assertEquals(statuscode, 201);
		
		System.out.println("Response----->");
		System.out.println(res.asPrettyString());
		
		
		System.out.println("Status code :"+statuscode);
		System.out.println("Status line  :"+res.statusLine());
		
		String header=res.header("Connection");
		
		Assert.assertEquals(header, "keep-alive");
		
		System.out.println("Connection header value--->"+header);
		
		System.out.println("All asserts passed");
		
		
		
		

	}

}
