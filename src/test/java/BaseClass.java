import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClass<RequestSpecsification> {

	static RestAssured req = new RestAssured();
	public static Response response;

	@Test
	public static Response request(String method, String url) throws FileNotFoundException {
		RequestSpecification req = (RequestSpecification) RestAssured.given();
		if (method.equalsIgnoreCase("GET")) {
			Response res = req.request(Method.GET, url);
			store(res);

			return res;

		} else if (method.equalsIgnoreCase("POST")) {
			Response res = req.request(Method.POST, url);
			store(res);

			return res;

		} else if (method.equalsIgnoreCase("PUT")) {
			Response res = req.request(Method.PUT, url);
			store(res);

			return res;

		} else if (method.equalsIgnoreCase("DELETE")) {
			Response res = req.request(Method.DELETE, url);
			store(res);

			return res;

		} else {

			return null;

		}

	}

	public static void store(Response response) throws FileNotFoundException {
		PrintWriter out = new PrintWriter("F:\\RestAssured\\src\\main\\resources\\responses.txt");
		out.append(response.getBody().prettyPrint());
		out.close();
	}

	public static void GET(String url) throws FileNotFoundException {
		Response res = req.request(Method.GET, url);
		store(res);
		System.out.println("Response using GET http method");

		System.out.println(res.getBody().asString());

	}

	public static void POST(String url) throws FileNotFoundException {
		Response res = req.request(Method.POST, url);
		store(res);

		System.out.println("Response using POST http method");
		System.out.println(res.getBody().asString());

	}

	public static void PUT(String url) throws FileNotFoundException {
		Response res = req.request(Method.PUT, url);
		store(res);
		System.out.println("Response using PUT http method");

		System.out.println(res.getBody().asString());
	}

	public static void DELETE(String url) throws FileNotFoundException {
		Response res = req.request(Method.DELETE, url);
		store(res);
		System.out.println("Response using DELETE http method");

		System.out.println(res.getBody().asString());
	}

	public static void runAllMethods(String url) throws FileNotFoundException {

		GET(url);
		POST(url);
		PUT(url);
		DELETE(url);

	}
}
