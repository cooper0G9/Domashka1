package homework5;

import java.io.*;
import java.util.Arrays;


public class main {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("test.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file,true))) {
            writer.write("\nValue 1;Value 2;Value 3\n" +
                    "100;200;123\n" +
                    "300;400;500"); //Заполняет файл. использовать \n для новой строки
        } catch (IOException e) {
            e.printStackTrace();
        }

        Apple.save(); //сохраняет новый текст, удаляя старый

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String str;
            String[] strMass;
            while ((str = reader.readLine()) != null){
                strMass = str.split(";");
                System.out.println(Arrays.toString(strMass));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
