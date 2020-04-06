package lesson13;

import java.io.*;

/*3.	Создать класс Notebook - наследник Computer. В этом классе должно быть поле типа Touchpad
- также созданного класса со своими полями.
Добавить в класс Notebook transient-поле. Создать объект класса Notebook, сериализовать в файл.
Десериализовать объект из файла, продемонстрировать, что transient-поля не сериализуются.
*/
public class task_3 {
    public static void main(String[] args) {
        Notebook notebook = new Notebook("Mouse", "Kyeboard", "Touchpad", "TestField");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\User\\IdeaProjects\\untitled\\src\\lesson13\\notebook.txt"))) {
            oos.writeObject(notebook);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\User\\IdeaProjects\\untitled\\src\\lesson13\\notebook.txt"))) {
            Notebook restoreNote = (Notebook) ois.readObject();
            System.out.println(restoreNote);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class Notebook extends Computer {
    private String touchpad;
    private transient String testTransientField;

    public Notebook(String mouse, String keyboard, String touchpad, String testTransientField) {
        super(mouse, keyboard);
    }
}
