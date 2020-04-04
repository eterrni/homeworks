package lesson12;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*2. Задан файл с текстом, найти и вывести в консоль все слова, начинающиеся с гласной буквы.*/
public class task_2 {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\User\\IdeaProjects\\untitled\\src\\lesson12\\task_1.txt");
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\User\\IdeaProjects\\untitled\\src\\lesson12\\task_1.txt"));
            String line;
            Pattern pattern = Pattern.compile("\\b([eyuioaуеыаоэяи])\\w*");
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

