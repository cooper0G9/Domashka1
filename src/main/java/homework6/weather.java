package homework6;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class weather {

    public static void main(String[] args) throws IOException {

        RestAssured.baseURI = "http://dataservice.accuweather.com/";
        Response response = given()
                .when()
                .get("forecasts/v1/daily/5day/294021?apikey=Tanq6qHneZNYDjtKEdqkiAh9Dwf5nZcQ");

        System.out.println(response.asPrettyString());
    }

}