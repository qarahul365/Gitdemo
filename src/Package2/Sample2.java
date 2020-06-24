package Package2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class Sample2 {

	@Test(dataProvider="BooksData")
	public static void AddBook(String isbn, String aisle) {
		RestAssured.baseURI="http://216.10.245.166";
		String Step1 = given().header("Content-Type", "application/json")
		.body(SampleJsonData.AddBook(isbn,aisle))
		.when().post("/Library/Addbook.php")
		.then().assertThat().statusCode(200).extract().response().asString();
		
		System.out.println(Step1);
		JsonPath js1 = new JsonPath(Step1);
		String Id=js1.getString("ID");
		System.out.println(Id);
		
	}
	
	@DataProvider(name="BooksData")
	public Object[][] getData() {

		// Arrays : Collection of elements
		// Multidimesional Arrays = Collection of Arrays
		
		return new Object[][] {{"MLP","112"},{"MLL","113"},{"MLN","114"}};
	}
	
}
