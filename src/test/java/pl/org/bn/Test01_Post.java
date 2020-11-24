package pl.org.bn;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import java.io.File;

import static io.restassured.RestAssured.given;

public class Test01_Post {
    @Test
    public void Test_POST()  {
        Response postResponse = given()
                .auth().none()
                .header("ContentType", "application/json")
                .contentType(ContentType.JSON)
                .when()
                .body(new File("src\\main\\resources\\user.json")).log().all()
                .post("https://reqres.in/api/users");

        System.out.println(postResponse.asString());
        System.out.println(postResponse.statusCode());

    }
}
