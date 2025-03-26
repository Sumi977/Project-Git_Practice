package reqresApiAutomation;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class PutApi {
    public String url = "https://fakerestapi.azurewebsites.net/api/v1/Books/100";
    public String contentType = "application/json";
    public Map<String,String> payload = null;

    @Test()
    public void updateApiMethod(){
        payload = new HashMap<>();
        payload.put("id","102");
        payload.put("title","Practice API");
        payload.put("description","This is a post API");
        payload.put("pageCount","500");
        payload.put("excerpt","string");

        given().contentType(contentType).body(payload)
                .when()
                .put(url)
                .then()
                .statusCode(200)
                .log()
                .body();

    }
}
