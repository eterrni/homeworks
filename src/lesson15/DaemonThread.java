package lesson15;

import java.util.concurrent.atomic.AtomicLong;

public class DaemonThread extends Thread {
    private AtomicLong sum;

    public DaemonThread(AtomicLong sum) {
        this.sum = sum;
        setDaemon(true);
        start();
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(11);
                System.out.println("[DaemonThread] sum:" + sum.get());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
