package Package1;

public class SampleData {
public static String AddPlace() {
	return "{\r\n" + 
			"  \"location\": {\r\n" + 
			"    \"lat\": -38.383494,\r\n" + 
			"    \"lng\": 33.427362\r\n" + 
			"  },\r\n" + 
			"  \"accuracy\": 50,\r\n" + 
			"  \"name\": \"Rahul Sharma Academy\",\r\n" + 
			"  \"phone_number\": \"(+91) 123 123 1234\",\r\n" + 
			"  \"address\": \"29, side layout, cohen 09\",\r\n" + 
			"  \"types\": [\r\n" + 
			"    \"shoe park\",\r\n" + 
			"    \"shop\"\r\n" + 
			"  ],\r\n" + 
			"  \"website\": \"http://rahulshettyacademy.com\",\r\n" + 
			"  \"language\": \"French-IN\"\r\n" + 
			"}\r\n" + 
			"";
}

public static String UpdateAddress(String PlaceId) {
	return "{\r\n" + 
			"\"place_id\":\""+PlaceId+"\",\r\n" + 
			"\"address\":\"C-1/11 Saket, New Delhi\",\r\n" + 
			"\"key\":\"qaclick123\"\r\n" + 
			"}";
}
}
