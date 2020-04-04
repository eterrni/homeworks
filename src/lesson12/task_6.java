package lesson12;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/*6 Вывести список файлов и каталогов выбранного каталога на диске с учетом вложенности директориев.
Для этого использовать рекурсию (пример рекурсии тут и тут).*/
public class task_6 {
    public static void main(String[] args) {
        File directory = new File("C:\\Users\\User\\IdeaProjects\\untitled\\src\\lesson12\\task_1.txt");
        getDirectory(directory);
    }

    private static void getDirectory(File directory) {
        if (directory.isDirectory()) {

            File[] array = directory.listFiles();

            for (int i = 0; i < array.length; i++) {
                Date date = new Date(array[i].lastModified());
                System.out.print("\n" + array[i].getPath() + " \t| " + array[i].length() + "\t| " + date.toString());
            }

            for (File x : array) {

                getDirectory(x);

            }
        }
    }
}
