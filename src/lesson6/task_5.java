/*5.	Бросить одно из существующих в JDK исключений, отловить его и выбросить своё собственное,
указав в качестве причины отловленное.*/
package lesson6;

public class task_5 extends task_4 {
    public static void main(String[] args) {
        try {
            throw_JDK_Excaption();
        } catch (ArrayIndexOutOfBoundsException ex) {
            throw_MyExcaption();
            ex.printStackTrace();
        }
    }

    private static void throw_MyExcaption() throws My_Class_Exception {
        throw new My_Class_Exception("My Excaption");
    }


    private static void throw_JDK_Excaption() throws ArrayIndexOutOfBoundsException {
        throw new ArrayIndexOutOfBoundsException();
    }
}
