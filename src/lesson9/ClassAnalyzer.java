package lesson9;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassAnalyzer {
    public static void analyzeClass(Class clazz) {
        analyzeMethods(clazz);
        analyzeConstructors(clazz);
        analyzeFields(clazz);
        analyzeAnnotations(clazz);
        analyzeTransaction(clazz);
    }

    private static void analyzeTransaction(Class clazz) {
        for (Method method : clazz.getMethods()) {
            for (Annotation annotation : method.getAnnotations()) {
                if (annotation instanceof Transaction) {
                    System.out.println("Transaction is started");
                    try {
                        method.invoke(new Object());
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Transaction is ended");
                }
            }
        }
    }

    private static void analyzeAnnotations(Class clazz) {
        int count_annotations = 0;
        Annotation[] annotations = clazz.getDeclaredAnnotations();
        for (Annotation annotation : annotations) {
            count_annotations++;
            System.out.println("Annotation name: " + annotation.getClass().getName());
        }
        System.out.println("Number of annotations :" + count_annotations);
    }

    private static void analyzeFields(Class clazz) {
        int count_fields = 0;
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            count_fields++;
            System.out.println("Field name:" + field.getName());
        }
        System.out.println("Number of fields in this class:" + count_fields);
    }

    private static void analyzeConstructors(Class clazz) {
        int count_constructors = 0;
        Constructor[] constructors = clazz.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            count_constructors++;
            System.out.println("Constructor name:" + constructor.getName());
        }
        System.out.println("Number of constructors in this class:" + count_constructors);
    }

    private static void analyzeMethods(Class clazz) {
        int count_methods = 0;
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            count_methods++;
            System.out.println("Method name:" + method.getName() + "  Return type:" + method.getReturnType());
        }
        System.out.println("Number of methods in this class:" + count_methods);
    }

}