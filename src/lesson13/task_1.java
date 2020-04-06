package lesson13;

import java.io.*;

/*1.Сравнить скорость чтения и записи 5 МБ символов при использовании классов
буфиризированого и не буфиризированого символьного ввода вывода.*/
public class task_1 {

    private static long start;
    private static long end;

    public static void main(String[] args) {
        File read = new File("C:\\Users\\User\\IdeaProjects\\untitled\\src\\lesson13\\7mb.txt");
        File write = new File("C:\\Users\\User\\IdeaProjects\\untitled\\src\\lesson13\\SpeedWrite.txt");
        File writeNonBuffered = new File("C:\\Users\\User\\IdeaProjects\\untitled\\src\\lesson13\\SpeedNonBuff.txt");
        checkBuffered(read, write);
        checkNonBuffered(read, writeNonBuffered);
    }

    private static void checkBuffered(File read, File write) {

        try (BufferedReader reader = new BufferedReader(new FileReader(read));
             BufferedWriter writer = new BufferedWriter(new FileWriter(write))) {
            start = System.currentTimeMillis();
            int nextCharBuffered;
            while ((nextCharBuffered = reader.read()) != -1) {

                writer.write(nextCharBuffered);
            }
            end = System.currentTimeMillis() - start;
            System.out.println(end + "ms");

        } catch (IOException e) {

            e.printStackTrace();
        }

    }

    private static void checkNonBuffered(File read, File write) {
        try (FileReader reader = new FileReader(read);
             FileWriter writer = new FileWriter(write)) {
            start = System.currentTimeMillis();
            int nextChar;
            while ((nextChar = reader.read()) != -1) {
                writer.write(nextChar);
            }
            end = System.currentTimeMillis() - start;
            System.out.println(end + "ms");
        } catch (IOException e) {

            e.printStackTrace();

        }
    }
}
