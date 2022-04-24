package L1_homework;

import L1_homework.Competition.Obstacles;
import L1_homework.Competition.Jump;
import L1_homework.Competition.Run;
import L1_homework.people.People;
import L1_homework.people.Team;

public class Main {


    public static void main(String[] args) {

        Obstacles obstacleCourse = new Obstacles(new Run(8), new Jump(9));

        Team team1 = new Team("Сокол", new People("Петя", 2, 8),
                new People("Миша", 5, 7),
                new People("Дима", 9, 1),
                new People("Саша", 11,49));
        Team team2 = new Team("Чайка", new People("Боря", 2, 8),
                new People("Женя", 5, 8),
                new People("Серёжа", 6, 7),
                new People("Лёша", 15,64));

        obstacleCourse.doIt(team1);
        obstacleCourse.doIt(team2);

        team1.getResult();
        System.out.println();
        team2.getResult();

    }


}
