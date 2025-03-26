package reqresApiAutomation;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostApi {
    public String url = "https://fakerestapi.azurewebsites.net/api/v1/Books";
    public String contentType = "application/json";
    public Map<String,String> payload = null;
    //{
    //  "id": 100,
    //  "title": "Practice API",
    //  "description": "This is a post API",
    //  "pageCount": 500,
    //  "excerpt": "string",
    //  "publishDate": "2025-03-24T21:12:37.243Z"
    //}
    @Test()
    public void postApiMethod(){
        payload = new HashMap<>();
        payload.put("id","100");
        payload.put("title","Practice API");
        payload.put("description","This is a post API");
        payload.put("pageCount","500");
        payload.put("excerpt","string");
        given().contentType(contentType).body(payload)
                .when()
                .post(url)
                .then()
                .statusCode(200)
                .log()
                .body()
                .body("id", equalTo(100));

    }

}
