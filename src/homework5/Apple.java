package homework5;

import java.io.*;

public class Apple{

    public static void save(){
        File file = new File("test.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file,false))) {
            writer.write("Value 1;Value 2;Value 3\n" +
                    "100;200;123\n" +
                    "300,400,500"); //перезаписывает файл. прописать сюда новый текст \n для новой строки
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}