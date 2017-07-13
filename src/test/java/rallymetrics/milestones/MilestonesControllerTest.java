package rallymetrics.milestones;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Before;
import org.junit.Test;


import io.restassured.RestAssured;


public class MilestonesControllerTest {
	private String basePath = "/rallyapi";
	private int basePort= 9000;
	private String baseHost = "http://localhost";
	
	@Before
	public void setup(){
		
		RestAssured.baseURI = baseHost;
		RestAssured.port = basePort;
		RestAssured.basePath= basePath;
		
	}
	
	@Test
	public void Milestones_Status_Success(){
		given()
			.param("numberOfMilestones", "1")
		.when()
			.get("/api/v1/milestones")
		.then()
			.statusCode(200);
	}
	
	@Test
	public void Milestones_SingleMilestone_Success(){
		given()
			.param("numberOfMilestones", "1")
		.when()
			.get("/api/v1/milestones")
		.then()
			.assertThat()
			.body("Name",is(not(equalTo(""))));
	}
	
	@Test
	public void Milestones_UsingDefaultParameterValue_Success(){
			get("/api/v1/milestones")
		.then()
			.statusCode(200);
	}
	
	
	
}
