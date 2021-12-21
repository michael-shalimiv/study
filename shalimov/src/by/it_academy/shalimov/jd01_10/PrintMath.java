package by.it_academy.shalimov.jd01_10;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import static java.lang.Math.*;

public class PrintMath {
    public static void main(String[] args) {
        Class<Math> ass = Math.class;
        Method[] methods = ass.getMethods();
        for (Method method : methods) {
            //if ((method.getModifiers() & Modifier.PUBLIC) != Modifier.PUBLIC)
            if (method.getDeclaringClass() == ass)
                System.out.println(method.toString().replace("java.lang.Math.", ""));
        }
        Field[] fields = ass.getFields();

        for (Field field : fields) {
            //if ((method.getModifiers() & Modifier.PUBLIC) != Modifier.PUBLIC)
            if (field.getDeclaringClass() == ass)
                System.out.println(field.toString().replace("java.lang.Math.", ""));

        }
    }
}
