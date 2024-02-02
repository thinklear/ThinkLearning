package com.Day1RestAssured;
import static  io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import  org.testng.annotations.Test;

/* given ()
 * When ()
 * then()
 */

public class HTTPRequests {
	int id;
	@Test (priority=2)
	void getUser() {
		given ()
		
		.when()
			.get("https://reqres.in/api/users?page=2")
		
		.then()
			.statusCode(200)
			.body("page", equalTo(2))

			.log().all();
	}
	@Test (priority=1)
	
	void creatUser() {
		HashMap data=new HashMap();
		data.put("name", "gokul");
		data.put("job ", "trainer");
		id =given ()
			.contentType("application/json")
			.body(data)
		.when ()
			.post("https://reqres.in/api/users")
			.jsonPath().getInt("id");
			
			
		//.then()
		//		.statusCode(201)
		//		.log().all();
	}
	@Test(priority=3, dependsOnMethods= {"creatUser"})
	
	void updateUser() {
		
		HashMap data=new HashMap();
		data.put("name", "Ram");
		data.put("job ", "Engineer");
		given ()
			.contentType("application/json")
			.body(data)
		.when ()
			.post("https://reqres.in/api/users/"+ id)
			
			
			
		.then()
				.statusCode(200)
			.log().all();
		
	}
	
	

}
