package com.jvm.classloader;

import java.lang.reflect.Method;

public class MyTest21 {
    public static void main(String[] args) throws Exception {
        MyTest17 loader1 = new MyTest17("loader1");
        MyTest17 loader2 = new MyTest17("loader2");
        loader1.setPath("C:/Users/lifeline张/Desktop/");
        loader2.setPath("C:/Users/lifeline张/Desktop/");
        Class<?> aClass1 = loader1.loadClass("com.jvm.classloader.MyPerson");
        Class<?> aClass2 = loader2.loadClass("com.jvm.classloader.MyPerson");
        System.out.println(aClass1 == aClass2);
        Object o1 = aClass1.newInstance();
        Object o2 = aClass2.newInstance();
        // 通过反射调用setMyPerson方法
        Method method = aClass1.getMethod("setMyPerson", Object.class);
        // 给O1对象传入O2的实例
        method.invoke(o1, o2);
    }

}
