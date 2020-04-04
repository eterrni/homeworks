package lesson12;

import java.io.*;

/*7. Задан файл с java-кодом. Прочитать текст программы из файла и записать
 в другой файл в обратном порядке символы каждой строки. */
public class task_7 {
    public static void main(String[] args) {
        File fileRead = new File("C:\\Users\\User\\IdeaProjects\\untitled\\src\\lesson12\\read.txt");
        File fileWrite = new File("C:\\Users\\User\\IdeaProjects\\untitled\\src\\lesson12\\write.txt");
        reverse(fileRead, fileWrite);
    }

    private static void reverse(File mainFile, File reverseFile) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(mainFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(reverseFile));
            String line;

            while ((line = reader.readLine()) != null) {
                for (int i = line.length() - 1; i >= 0; i--) {
                    writer.write(line.charAt(i));
                }
                writer.write("\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
