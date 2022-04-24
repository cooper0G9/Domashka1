package L1_homework.Competition;

import L1_homework.people.People;
import L1_homework.people.Team;

public class Jump extends Comp {
    private int height;

    public Jump(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Team team) {
        for (People people : team.getPeoples()) {
            if (people.heightJump() >= height) {
                people.setResult(this, true);
            } else {
                people.setResult(this, false);
            }
        }

    }

    @Override
    public String toString() {
        return "Соревнования по прыжкам в высоту";
    }
}
