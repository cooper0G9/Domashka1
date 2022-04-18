package Lesson5;

public class Person {
    String name;
    String position;
    String email;
    int money;
    int age;
    String phone;

    Person (String name,String position,String email,String phone, int age,int money){
        this.name=name;
        this.position=position;
        this.email=email;
        this.phone=phone;
        this.age=age;
        this.money=money;
        System.out.println("ФИО: "+ name+" Должность: "+ position+" емейл: "+ email + " Телефон: "+ phone+" Зарплата: "+ money+" Возраст: "+ age);

    }


}