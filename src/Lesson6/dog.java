package Lesson6;

public class dog extends animal {
    String color;
    public dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void dogInfo() {
        System.out.println("Собака имя: " + name);
        System.out.println("Цвет: " + color);
    }
}
