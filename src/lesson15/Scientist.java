package lesson15;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class Scientist extends Thread {
    Dump dump;
    private Map<RobotDetails, Integer> map_ScientistDetails = new HashMap<>();

    Scientist(Dump dump) {
        map_ScientistDetails.put(RobotDetails.HEAD, 0);
        map_ScientistDetails.put(RobotDetails.BODY, 0);
        map_ScientistDetails.put(RobotDetails.LEFT_HAND, 0);
        map_ScientistDetails.put(RobotDetails.RIGHT_HAND, 0);
        map_ScientistDetails.put(RobotDetails.LEFT_LEG, 0);
        map_ScientistDetails.put(RobotDetails.RIGHT_LEG, 0);
        map_ScientistDetails.put(RobotDetails.CPU, 0);
        map_ScientistDetails.put(RobotDetails.RAM, 0);
        map_ScientistDetails.put(RobotDetails.HDD, 0);
        this.dump = dump;
    }

    public void addScientistDetails(RobotDetails detail) {
        map_ScientistDetails.put(detail, map_ScientistDetails.get(detail) + 1);
    }

    public Map<RobotDetails, Integer> getMap_ScientistDetails() {
        return map_ScientistDetails;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) dump.getDumpDetails(i, this);
        System.out.println("Scientist details: " + getMap_ScientistDetails() + "\n" + "The number of robots that he was able to collect: " + countOfRobots());
    }

    private int countOfRobots() {
        return map_ScientistDetails.values().stream()
                .mapToInt(i -> i)
                .min()
                .orElseThrow(NoSuchElementException::new);
    }

}
