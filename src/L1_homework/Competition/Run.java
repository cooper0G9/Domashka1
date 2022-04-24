package L1_homework.Competition;

import L1_homework.people.People;
import L1_homework.people.Team;

public class Run extends Comp {

    private double time;

    public Run(double time) {
        this.time = time;
    }

    @Override
    public void doIt(Team team) {
        for (People people : team.getPeoples()) {
            if (people.hundredMeterRun() >= time) {
                people.setResult(this, true);
            } else {
                people.setResult(this, false);
            }
        }

    }

    @Override
    public String toString() {
        return "Соревнования по бегу на 100 метров";
    }
}
