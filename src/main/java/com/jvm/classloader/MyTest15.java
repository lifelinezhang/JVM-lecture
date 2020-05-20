package com.jvm.classloader;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

public class MyTest15 {
    public static void main(String[] args) throws IOException {
        // 获取线程上下文类加载器，即应用程序类加载器
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        System.out.println(classLoader);
        String resourceName = "com/jvm/classloader/MyTest13.class";
        // 通过给定名获取磁盘上所有这个路径的文件
        Enumeration<URL> urls = classLoader.getResources(resourceName);
        while (urls.hasMoreElements()) {
            URL url = urls.nextElement();
            System.out.println(url);
        }
        System.out.println("======");
        Class<MyTest15> aClass = MyTest15.class;
        System.out.println(aClass.getClassLoader());
        System.out.println("======");
        Class<?> aClass1 = String.class;
        System.out.println(aClass1.getClassLoader());
    }
}
