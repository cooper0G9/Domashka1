package Lesson7;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Plate plate = new Plate(150);

        Cat cat1 = new Cat("Барсик", 100, false);
        Cat cat2 = new Cat("Лола", 15, false);
        Cat cat3 = new Cat("Крыс", 70, false);
        Cat cat4 = new Cat("Кусь", 100, false);
        Cat cat5 = new Cat("Мявк", 50, false);


        Cat cats[] = new Cat[5];
        cats[0] = cat1;
        cats[1] = cat2;
        cats[2] = cat3;
        cats[3] = cat4;
        cats[4] = cat5;



        for (int i = 0; i < 5; i++) {
            System.out.println();
            System.out.println(cats[i].getName() + " идет кушать");
            cats[i].eat(plate);
            if (cats[i].isFullness() == true) {
                System.out.println(cats[i].getName() + " сыт(а)");
                System.out.println("В тарелке " + plate.getFood());
            } else {
                System.out.println(cats[i].getName() + " не покушал(ла) и голоден(на)");
                System.out.println("Сколько еды положить в тарелку?");
                Scanner scanner = new Scanner(System.in);
                while (cats[i].isFullness() != true) {
                    int sc = scanner.nextInt();
                    plate.setFood(plate.getFood() + sc); //кладем еду
                    cats[i].eat(plate);
                    System.out.println("В тарелке " + plate.getFood());
                }
                System.out.println(cats[i].getName() + " сыт(а)");

            }


        }
    }
}