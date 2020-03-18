/*2. Заменить все грустные смайлы :( в строке на весёлые :)*/
package lesson7;

public class task_2 {
    public static void main(String[] args) {
        String s1 = ":( :( :(";
        System.out.println(s1);
        System.out.println(s1.replace(":(", ":)"));
    }
}
