package Package2;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class StaticJson {
	@Test
	public static void AddBook() throws IOException {
		RestAssured.baseURI="http://216.10.245.166";
		String Step1 = given().header("Content-Type", "application/json")
		.body(GenerateStingFromResources("C:\\Users\\rahul_sharma\\Desktop\\AddBookDetails.json"))
		.when().post("/Library/Addbook.php")
		.then().assertThat().statusCode(200).extract().response().asString();
		
		System.out.println(Step1);
		JsonPath js1 = new JsonPath(Step1);
		String Id=js1.getString("ID");
		System.out.println(Id);
		
	}
	
	public static String GenerateStingFromResources(String path) throws IOException {
		return new String(Files.readAllBytes(Paths.get(path)));
		
	}
}
