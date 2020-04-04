package lesson12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*3. Задан файл с текстом, найти и вывести в консоль все слова,
для которых последняя буква одного слова совпадает с первой буквой следующего слова*/
public class task_3 {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\User\\IdeaProjects\\untitled\\src\\lesson12\\task_1.txt");
           BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\User\\IdeaProjects\\untitled\\src\\lesson12\\task_1.txt"));
            String line ;
            Pattern pattern = Pattern.compile("\\b([\\w])\\w*\\1\\b");
            Matcher matcher = pattern.matcher("");
            while ((line = bufferedReader.readLine()) != null) {
                matcher.reset(line);
                while (matcher.find()) {
                    System.out.println(matcher.group());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}