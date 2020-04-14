package lesson15;

import java.util.HashMap;
import java.util.Map;

public class Factory extends Thread {
    Dump dump;
    public Map<Integer, RobotDetails> map_Factory = new HashMap<>();

    Factory(Dump dump) {
        map_Factory.put(1, RobotDetails.HEAD);
        map_Factory.put(2, RobotDetails.BODY);
        map_Factory.put(3, RobotDetails.LEFT_HAND);
        map_Factory.put(4, RobotDetails.RIGHT_HAND);
        map_Factory.put(5, RobotDetails.LEFT_LEG);
        map_Factory.put(6, RobotDetails.RIGHT_LEG);
        map_Factory.put(7, RobotDetails.CPU);
        map_Factory.put(8, RobotDetails.RAM);
        map_Factory.put(9, RobotDetails.HDD);

        this.dump = dump;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) putDetails(i, dump);
    }

    public void putDetails(int numberOfNight, Dump dump) {
        numberOfNight++;
        dump.putDumpDetails(map_Factory, numberOfNight);
        try {
            Thread.sleep(150);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}