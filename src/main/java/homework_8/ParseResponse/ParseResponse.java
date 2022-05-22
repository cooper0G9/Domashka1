package homework_8.ParseResponse;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import homework7.Data.Tags;
import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class ParseResponse {

    private final Response response;


    public ParseResponse(){
        RestAssured.baseURI = "http://dataservice.accuweather.com/";
        response = given()
                .when()
                .get("forecasts/v1/daily/5day/332287?apikey=dtRa5lQyIIpq4KP6POoNONCW64dECRdl");


    }
    @SneakyThrows
    public List<Tags> getDailyForecasts(){
        ObjectMapper objectMapper = new ObjectMapper();

        JsonNode jsonNode = objectMapper
                .readTree(response.asPrettyString())
                .at("/DailyForecasts");

        List<Tags> dailyForecasts = new ArrayList<>();

        if(jsonNode.isArray()){
            for (JsonNode arrayItem : jsonNode) {
                dailyForecasts.add(objectMapper.convertValue(arrayItem,Tags.class));
            }

        }

        return dailyForecasts;
    }

}
