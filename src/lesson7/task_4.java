/*4. Написать функцию, принимающую в качестве параметров имя, фамилию и отчество и возвращающую инициалы
в формате "Ф.И.О". Учесть, что входные параметры могут быть в любом регистре,
а результирующая строка должна быть в верхнем.
*/
package lesson7;

import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String firstName=scan.next(); // имя
        String lastName=scan.next();  // фамилия
        String middleName=scan.next(); // отчество
        System.out.println(Initials(firstName,lastName,middleName));
    }
    private static String Initials(String firstName,String lastName,String middleName){
        char a=Character.toUpperCase(lastName.charAt(0));
        char b=Character.toUpperCase(firstName.charAt(0));
        char c=Character.toUpperCase(middleName.charAt(0));
        return a+"."+b+"."+c+".";
    }
}
