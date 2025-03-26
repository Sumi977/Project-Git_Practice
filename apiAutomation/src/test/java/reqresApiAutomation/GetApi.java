package reqresApiAutomation;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetApi {
    @Test()
    public void getSingleUserList() {
        String url = "https://reqres.in/api/users/2";
        given()
                .when()
                .get(url)
                .then()
                .body("data.id", equalTo(2))
                .statusCode(200);
    }
}