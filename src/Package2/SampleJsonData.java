package Package2;

public class SampleJsonData {

	public static String AddBook(String isbn, String aisle) {
		String payload = "{\r\n" + 
				"	\r\n" + 
				"\"name\":\"Learn Appium Automation with Java 1\",\r\n" + 
				"\"isbn\":\""+isbn+"\",\r\n" + 
				"\"aisle\":\""+aisle+"\",\r\n" + 
				"\"author\":\"Author One\"\r\n" + 
				"}";
		return payload;
	}
	
}
