package lesson12;

import java.io.*;

/*5. Записать в двоичный файл 20 случайных чисел типа int со значением больше 255.
Прочитать записанный файл, распечатать числа и их среднее арифметическое.*/
public class task_5 {
    public static int[] array = new int[]{312, 257, 258, 259, 260, 270, 280, 256, 259, 259, 352, 644, 277, 568, 277, 290, 257, 444, 523, 876};

    public static void main(String[] args) {

        File file = new File("C:\\Users\\User\\IdeaProjects\\untitled\\src\\lesson12\\IntBinary.txt");

        bitFile(file);
        readBitFile(file);

    }

    public static void bitFile(File file) {

        try (FileOutputStream out = new FileOutputStream(file)) {

            for (int i : array) {

                out.write((array[i] >>> 24) & 0xFF);
                out.write((array[i] >>> 16) & 0xFF);
                out.write((array[i] >>> 8) & 0xFF);
                out.write((array[i]) & 0xFF);
            }
        } catch (IOException e) {

            e.printStackTrace();

        }

    }

    public static void readBitFile(File file) {

        int[] testArr = new int[20];
        int res = 0;

        try (FileInputStream input = new FileInputStream(file)) {

            for (int i = 0; i < testArr.length; i++) {

                int ch1 = input.read();
                int ch2 = input.read();
                int ch3 = input.read();
                int ch4 = input.read();
                if ((ch1 | ch2 | ch3 | ch4) < 0) {
                    throw new EOFException();
                }
                testArr[i] = ((ch1 << 24) + (ch2 << 16) + (ch3 << 8) + (ch4));

                res += testArr[i];
            }
            System.out.println((double) res / testArr.length);


        } catch (IOException e) {

            e.printStackTrace();

        }
    }
}
