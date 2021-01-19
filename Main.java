package com.company;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
	// write your code here
        Class<?> cls = TestClass.class;
        Method[] methodArr = cls.getDeclaredMethods();
        for (Method method : methodArr) {
            if(method.isAnnotationPresent(Test.class)) {
                int a = method.getAnnotation(Test.class).a();
                int b = method.getAnnotation(Test.class).b();
                method.invoke(null, a, b);
            }
        }
    }
}
