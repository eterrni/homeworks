package lesson2;

public class zadanie2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int chislo = 13;
        int kolvo = 0;
        int i=0;
        do {
            if(chislo%13==0 || chislo%17==0){
                array[i]=chislo;
                System.out.println(i+":"+array[i]+";");
                kolvo++;
                chislo++;
                i++;
            }chislo++;
        } while(kolvo!=100);
    }
}
