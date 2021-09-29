import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BeanLoginAPI extends BaseClass{
	
	@Test
	public void BeanLogin()
	{
		
		Response res=req.post("https://portal.beanlogin.com/BeanLoginAPI/api/v1/BeanLogin/authenticateUser");
		
		
		RequestSpecification reqSp=RestAssured.given();
		
		
		JSONObject requestParams = new JSONObject();
		

		
		reqSp.header("Content-Type", "application/json");
		
		requestParams.put("DeviceToken", "etcdMNCk6bI:APA91bEcyOy0Q6fuMu_2SIUuq76RwsNeuaYesy7C-QE-BCwyYCDevBboJbt7y1kR1u77NghuC0MRGBq_SGjbc2pG6cqDYRdDbQB3PR98J6cHqpnMcDi5lO3K1mDkOnTPzcZVJF3GnfUc");
		requestParams.put("DeviceId", "ca7fe5fd-0036-492a-81c1-3c33fd965bf7");
		requestParams.put("DeviceModel", "Android HUAWEI HWANE");
		requestParams.put("Location", "City :- Pune, State :- Maharashtra, Postal Code :- 411007, Country :- India");
		requestParams.put("Password",  "APIStrong12345");
		requestParams.put("UserName", "apistrongtester@mailinator.com");
		requestParams.put("version",  "1467");
		

		reqSp.body(requestParams.toJSONString());
		
		
		System.out.println(res.statusCode());
		System.out.println(res.getBody().asString());
		
		Assert.assertEquals(res.statusCode(), 200);
		
		
		//JSONPath js=new JSONPath();
	
		
		
		
	
		
		
		
	}

}
