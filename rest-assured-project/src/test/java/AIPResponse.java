import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.relaxng.datatype.Datatype;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import io.restassured.response.Response;

public class AIPResponse {
	
	@Test
	public void Test_1_GET() {
		given().
			    when().
		        get("https://reqres.in/api/users/2").
		    then().
		        assertThat().
		        body("data.email", equalTo("janet.weaver@reqres.in"));
		
		
	}
	
	@Test
	public void Test_2_POST() {
		JsonObject request = new JsonObject();
		
		request.addProperty("name", "Raj");
		request.addProperty("job", "Developer");
		
		System.out.println(request);
		
		 given().
		        body(request.toString()).
		 when().
		        post("https://reqres.in/api/users").
		 then().
		        statusCode(201);
		
	}
	
	@Test
	public void Test_3_PUT() {
		JsonObject request = new JsonObject();
		
		request.addProperty("name", "Morpheus2");
		request.addProperty("job", "zion resident");
		
		System.out.println(request);
		
		 given().
		        body(request.toString()).
		 when().
		        put("https://reqres.in/api/users/2").
		 then().
		        statusCode(200).log().all();
		
	}
	
	@Test
	public void Test_4_PATCH() {
		JsonObject request = new JsonObject();
		
		request.addProperty("name", "Morpheus2");
		request.addProperty("job", "zion resident");
		
		System.out.println(request);
		
		 given().
		        body(request.toString()).
		 when().
		        patch("https://reqres.in/api/users/2").
		 then().
		        statusCode(200).log().all();
		
	}
	
	@Test
	public void Test_5_DELETE() {
		
		 given().
		        delete("https://reqres.in/api/users/2").
		 then().
		        statusCode(204);
		
	}
	
	
}
