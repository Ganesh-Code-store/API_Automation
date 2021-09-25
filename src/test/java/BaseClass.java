import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClass<RequestSpecsification> {

	@Test
	public static String request(String method, String url) {
		RequestSpecification req = (RequestSpecification) RestAssured.given();

		if (method.equals("GET")) {
			Response res = req.request(Method.GET, url);
			return res.asPrettyString();
		} else if (method.equals("POST")) {
			Response res = req.request(Method.POST, url);
			return res.asPrettyString();

		} else if (method.equals("PUT")) {
			Response res = req.request(Method.PUT, url);

			return res.asPrettyString();


		} else if (method.equals("DELETE")) {
			Response res = req.request(Method.DELETE, url);
			return res.asPrettyString();

		}
		else
		{
			return null;
	
		}
		
	}

}
