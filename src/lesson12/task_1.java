package lesson12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*1. Задан файл с многострочным текстом. Прочитать и вывести этот файл в консоль построчно.*/
public class task_1 {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\User\\IdeaProjects\\untitled\\src\\lesson12\\task_1.txt");
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\User\\IdeaProjects\\untitled\\src\\lesson12\\task_1.txt"));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
