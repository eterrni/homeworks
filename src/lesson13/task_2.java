package lesson13;

import java.io.*;

/*2.Создать класс Computer. Добавить ему несколько полей, создать объект этого класса, сериализовать в файл.
Десериализовать объект из того же файла, вывести значения полей в консоль.*/
public class task_2 {
    public static void main(String[] args) {
        Computer computer_1 = new Computer("TestMouse", "TestKeyboard");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\User\\IdeaProjects\\untitled\\src\\lesson13\\computer.txt"))) {
            oos.writeObject(computer_1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\User\\IdeaProjects\\untitled\\src\\lesson13\\computer.txt"))) {
            Computer restoreComputer_1 = (Computer) ois.readObject();
            System.out.println(restoreComputer_1);

        } catch (IOException | ClassNotFoundException e) {

            e.printStackTrace();

        }
    }
}

class Computer implements Serializable {
    private String mouse;
    private String keyboard;

    public Computer(String mouse, String keyboard) {
        this.mouse = mouse;
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return "Mouse: " + this.mouse + ".Keyboard: " + this.keyboard;
    }
}
