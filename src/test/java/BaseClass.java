import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClass<RequestSpecsification> {

	RestAssured req = new RestAssured();
	public static Response response;

	@Test
	public static Response request(String method, String url) throws FileNotFoundException {
		RequestSpecification req = (RequestSpecification) RestAssured.given();
		if (method.equals("GET")) {
			Response res = req.request(Method.GET, url);
			store(res);

			return res;

		} else if (method.equals("POST")) {
			Response res = req.request(Method.POST, url);
			store(res);

			return res;

		} else if (method.equals("PUT")) {
			Response res = req.request(Method.PUT, url);
			store(res);

			return res;

		} else if (method.equals("DELETE")) {
			Response res = req.request(Method.DELETE, url);
			store(res);

			return res;

		}
        else {

        	return null;

		}


	}

	public static void store(Response response) throws FileNotFoundException {
		PrintWriter out = new PrintWriter("F:\\RestAssured\\src\\main\\resources\\responses.txt");
		out.println(response.getBody().prettyPrint());

		out.close();
	}

}
