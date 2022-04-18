package Lesson6;

public class animal {
    String name;


    public animal() {
    }

    public void swim(int Distance) {
        if (Distance>10){
            System.out.println("Собака столько не плавает");
        }
        else {
            System.out.println(name + " проплыл " + Distance + " метров");
        }

    }
    public void swim() {
        System.out.println(name+" плавать не умеет");

    }
    public void run(int Distance, int type){ //type 1 = кот, type 2 = собака
        if (type==1 && Distance>200) {
            System.out.println("Коты столько не бегают");
        }
        else if (type==2 && Distance>500){
            System.out.println("Собака столько не бегает");
        }
        else
            System.out.println(name + " пробежал " + Distance + " метров");
    }
}
