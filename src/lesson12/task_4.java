package lesson12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*4. Задан файл с текстом. В каждой строке найти и вывести наибольшее число цифр, идущих подряд.*/
public class task_4 {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\User\\IdeaProjects\\untitled\\src\\lesson12\\task_1.txt");
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\User\\IdeaProjects\\untitled\\src\\lesson12\\task_1.txt"));
            String line;
            Pattern pattern = Pattern.compile("\\b[\\d]\\d*");
            Matcher matcher = pattern.matcher("");
            String str = null;
            int count=0;
            while ((line = bufferedReader.readLine()) != null) {
                matcher.reset(line);
                while (matcher.find()) {
                    if (matcher.group().length() > count) {
                        count = matcher.group().length();
                        str = matcher.group();
                    }
                }
            }
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
