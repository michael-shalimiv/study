package by.it_academy.shalimov.jd01_10;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class PrintString {
    public static void main(String[] args) {
        Class<String> ass = String.class;
        Method[] methods = ass.getDeclaredMethods();
        for (Method m : methods){
            if ((m.getModifiers() & Modifier.STATIC) != Modifier.STATIC && m.getDeclaringClass() == ass)
                System.out.println(m.getName());
        }
    }
}
