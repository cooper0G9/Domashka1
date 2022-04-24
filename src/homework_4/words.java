package homework_4;

import java.util.*;

public class words {
    public static void main(String[] args){
        String[] a= {"Раз","Два","Раз","Раз","Проверка","Подсчет","Раз","Окей","Работает","Раз","Конец"};

        Map<String, Integer> counter = new HashMap<>();
        for (String x : a) {
            int newValue = counter.getOrDefault(x, 0) + 1;
            counter.put(x, newValue);
        }

        System.out.println(counter);

    }
}
