package homework_8;

import homework7.Data.Tags;
import homework_8.dbConnection.DbConnection;
import homework_8.ParseResponse.ParseResponse;

public class main {

    public static void main(String[] args) {

        DbConnection dbConnection = new DbConnection();
        ParseResponse parseResponse = new ParseResponse();

        for (Tags dailyForecast: parseResponse.getDailyForecasts()) {

            dbConnection.insertValue("Moscow",
                    dailyForecast.getDate(),
                    dailyForecast.getDay().getIconPhrase(),
                    Double.parseDouble(dailyForecast.getTemperature().getMinimum().getValue()));

        }

        System.out.println(dbConnection.getValue("city","localDate","weatherText",  "temperature", 77.0));

    }

}