package Lesson5;

public class Main {

    public static void main(String[] args) {

        Person Person1 = new Person("Ivanov Sergei Ivanovich |", "engineer |", "Iv189@yabdex.ru |", "89854445599 |", 35, 2000);
        Person Person2 = new Person("Sergeev Sergei Ivanovich |", "junior engineer |", "ahahaa@yabdex.ru |", "89854445524 |", 45, 3500);
        Person Person3 = new Person("Sidorov Sidor Ivanovich |", "cleener |", "aha34a@yabdex.ru |", "89854445534 |", 60, 700);
        Person Person4 = new Person("Petrov Alexandr Ivanovich |", "architect |", "ahahaa@yabdex.ru |", "89854445599 |", 30, 4000);
        Person Person5 = new Person("Denisov Denis Ivanovich |", "manager |", "ahahaa@yabdex.ru |", "89854445599 |", 41, 1500);

        Person[] Persons = new Person[5];
        Persons[0]=Person1;
        Persons[1]=Person2;
        Persons[2]=Person3;
        Persons[3]=Person4;
        Persons[4]=Person5;
        System.out.println("Сотрудники за 40");
        for (int i=0;i<5;i++){
            if (Persons[i].age>=40)
                System.out.println("ФИО: "+ Persons[i].name+" Должность: "+ Persons[i].position+" емейл: "+ Persons[i].email + " Телефон: "+ Persons[i].phone+" Зарплата: "+ Persons[i].money+" Возраст: "+ Persons[i].age);
        }


    }
}
