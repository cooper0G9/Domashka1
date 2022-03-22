package Lesson6;

public class AnimalsApp {
    public static void main(String[] args) {

        cat cat = new cat("Барсик", "Персиковый");

        cat.catInfo();
        cat.run(200,1);
        cat.swim();
        dog dog = new dog("Бобик", "Черный");



        dog.dogInfo();
        dog.run(500,2);
        dog.swim(10);


    }
}

