package homework7;


import homework7.Data.Tags;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class Forecast {

    public static void main(String[] args) throws IOException {

        RestAssured.baseURI = "http://dataservice.accuweather.com/";
        Response response = given()
                .when()
                .get("forecasts/v1/daily/5day/332287?apikey=Tanq6qHneZNYDjtKEdqkiAh9Dwf5nZcQ");

        System.out.println(response.asPrettyString());

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


        for (Tags dailyForecast : dailyForecasts) {
            double minDouble = Double.parseDouble(dailyForecast.getTemperature().getMinimum().getValue());
            double min = 5.0/9.0*(minDouble - 32);
            double maxDoable = Double.parseDouble(dailyForecast.getTemperature().getMaximum().getValue());
            double max = 5.0/9.0*(maxDoable - 32);
            DecimalFormat decimalFormat = new DecimalFormat("#");
            String max1 = decimalFormat.format(max);
            String min1 = decimalFormat.format(min);




            System.out.println("В Москве " + dailyForecast.getDate().substring(0,10) + " ожидается температура от " +
                    min1 +  " до " +
                    max1) ;
        }




    }



}
