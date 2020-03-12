/*2.	Написать код, который создаст, а затем отловит ArrayIndexOutOfBoundsException.*/
package lesson6;

public class task_2 {
    public static void main(String[] args) {
        int[] arr = new int[2];
        try {
            arr[2] = 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            arr[arr.length - 1] = 1;
        }
        System.out.println(arr[arr.length - 1]);
    }
}
