package Package1;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class Sample1 {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String Step1=given().queryParam("key", "qaclick123").header("Content-Type", "application/json")
		.body(SampleData.AddPlace()).when().post("maps/api/place/add/json")
				.then().assertThat().statusCode(200).extract().response().asString();
				System.out.println(Step1);
				JsonPath js1 = new JsonPath(Step1);
				String PlaceId=js1.getString("place_id");
				System.out.println(PlaceId);
		
		String Step2=given().queryParam("key", "qaclick123").header("Content-Type", "application/json")
		.body(SampleData.UpdateAddress(PlaceId))
		.when().put("maps/api/place/update/json")
		.then().assertThat().statusCode(200).extract().response().asString();
		System.out.println(Step2);
		
		String Step3=given().queryParam("key", "qaclick123").queryParam("place_id", PlaceId)
				.when().post("maps/api/place/get/json")
						.then().assertThat().statusCode(200).extract().response().asString();
						System.out.println(Step3);
						JsonPath js3 = new JsonPath(Step3);
						String Address=js3.getString("address");
						System.out.println(Address);
		
	}

}
