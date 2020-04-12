package lesson15;

import java.util.concurrent.atomic.AtomicLong;

/*Создать поток, который будет в цикле итерироваться от 1 до 10_000_000 и суммировать каждый четный элемент кратный 3.
На каждой итерации, кратной 1_000_000, поток должен заснуть на 10 мс.Вместе с суммирующим потоком запустить поток демон,
который каждую пятую миллисекунду выводит в консоль текущее значение просуммированных элементов.*/

/*Милисекунды в sleep() подгонял под свой компьютер, чтобы было 9-11 выводов. С кол-вом секунд из нашего условия, у меня около 20 выводов и бывают повторы*/
public class Main {
    public static void main(String[] args) {
        AtomicLong sum = new AtomicLong();

        MyThread myThread = new MyThread(sum);
        myThread.start();
        DaemonThread daemonThread = new DaemonThread(sum);
    }
}
