package L1_homework.people;

import L1_homework.people.People;

public class Team {

    private People[] peoples;
    private String name;

    public Team(String name, People ... peoples) {
        this.name = name;
        this.peoples = peoples;
    }

    public People[] getPeoples() {
        return peoples;
    }

    public void getResult() {
        for (People people : peoples) {
            System.out.println("Результаты соревнований участника по имени  " + people.getName() + " " + people.getResult());
        }
    }


}
