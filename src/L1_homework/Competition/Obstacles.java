package L1_homework.Competition;

import L1_homework.people.Team;

public class Obstacles<T extends Comp> {


    private T[] obstacles;

    @SafeVarargs
    public Obstacles(T... obstacles) {
        this.obstacles = obstacles;

    }


    public void doIt(Team team) {

        for (T obstacle : obstacles) {
            obstacle.doIt(team);
        }


    }


}
