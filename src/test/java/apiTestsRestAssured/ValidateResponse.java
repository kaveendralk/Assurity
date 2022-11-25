package apiTestsRestAssured;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ValidateResponse {
	
	
	/*  Acceptance Criteria:
		•	Name = "Carbon credits"
		•	CanRelist = true
		•	The Promotions element with Name = "Gallery" has a Description that contains the text "Good position in category"
	*/
	
	@Test
	public void validate_GET_Response() {
		baseURI = "https://api.tmsandbox.co.nz/v1/";
		
		given().		
			get("/v1/Categories/6327/Details.json?catalogue=false").
		then().
			statusCode(200).
			body("Name", equalTo("Carbon credits")).
			body("CanRelist", equalTo(true)).
			body("Promotions[1].Name", equalTo("Gallery")).
			body("Promotions[1].Description", containsString("Good position in category"));
		
	}

}
