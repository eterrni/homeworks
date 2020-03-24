package lesson9;

public class MathUtil {

    public static <T extends Number> Number sum(Math<T> number){
        T num_1=number.getNumber_1();
        T num_2=number.getNumber_2();
        Number res = null;
        if(num_1 instanceof Integer){
            res=(Integer)(num_1.intValue()+num_2.intValue());
        } else if(num_1 instanceof Double){
            res=(Double)(num_1.doubleValue()+num_2.doubleValue());
        } else if(num_1 instanceof Float){
            res=(Float)(num_1.floatValue()+num_2.floatValue());
        }
        return res;
    }
    public static <T extends Number> Number multiplication(Math<T> number){
        T num_1=number.getNumber_1();
        T num_2=number.getNumber_2();
        Number res = null;
        if(num_1 instanceof Integer){
            res=(Integer)(num_1.intValue()*num_2.intValue());
        } else if(num_1 instanceof Double){
            res=(Double)(num_1.doubleValue()*num_2.doubleValue());
        } else if(num_1 instanceof Float){
            res=(Float)(num_1.floatValue()*num_2.floatValue());
        }
        return res;
    }

}
