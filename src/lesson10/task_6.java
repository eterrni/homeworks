package lesson10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*6.	Имеется текст. Следует составить для него частотный словарь*/
public class task_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = scan.nextLine();
        FrequencyDictionary.frequencyDictionary(text);
    }
}

class FrequencyDictionary {
    protected static void frequencyDictionary(String text) {
        String[] words = text.split("[^А-Яа-яёЁA-Za-z]+");
        int[] count = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            for (String word : words) {
                if (words[i].equals(word)) {
                    count[i]++;
                }
            }

        }

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], count[i]);
        }

        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
