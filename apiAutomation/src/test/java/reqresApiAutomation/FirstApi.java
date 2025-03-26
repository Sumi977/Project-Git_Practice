package reqresApiAutomation;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class FirstApi {
    @Test()
    public void getListOfUser(){
        String urlEndPoint = "https://reqres.in/api/users?page=2";
        Response response = given()
                .when()
                .log()
                .all()
                .get(urlEndPoint);
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().asString());

    }
}
