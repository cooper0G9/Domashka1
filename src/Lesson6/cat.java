package Lesson6;

public class cat extends animal {
    String color;
    public cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void catInfo() {
        System.out.println("Кот имя: " + name);
        System.out.println("Цвет: " + color);
    }
}

