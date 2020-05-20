package com.jvm.classloader;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class MyTest17 extends ClassLoader {

    private String classLoaderName;

    private String path; // class文件路径

    private final String fileExtension = ".class";

    public MyTest17(String classLoaderName) {
        super(); // 将系统类加载器作为该类加载器的父类加载器
        this.classLoaderName = classLoaderName;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public MyTest17(ClassLoader parent, String classLoaderName) {
        super(parent); // 显式指定该类加载器的父加载器
        this.classLoaderName = classLoaderName;
    }


    @Override
    public String toString() {
        return "MyTest17{" +
                "classLoaderName='" + classLoaderName + '\'' +
                '}';
    }


    @Override
    protected Class<?> findClass(String className) throws ClassNotFoundException {
        System.out.println("findClass:" + className);
        System.out.println("class loader name:" + this.classLoaderName);
        // 父类中findClass方法返回的是一个异常，所以必须要重写
        byte[] data = this.loadClassData(className);
        return this.defineClass(className, data, 0, data.length);
    }

    private byte[] loadClassData(String className) {
        InputStream is = null;
        byte[] data = null;
        ByteArrayOutputStream baos = null;
        className = className.replace(".", "/");
        try {
            is = new FileInputStream(new File(this.path + className + this.fileExtension));
            System.out.println(this.path + className + this.fileExtension);
            baos = new ByteArrayOutputStream();
            int ch;
            while (-1 != (ch = is.read())) {
                baos.write(ch);
            }
            data = baos.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
                baos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return data;
    }


    public static void main(String[] args) throws Exception {
        MyTest17 loader1 = new MyTest17("loader1");
        loader1.setPath("C:/Users/lifeline张/Desktop/");
        Class<?> aClass = loader1.loadClass("com.jvm.classloader.User");
        System.out.println("aClass" + aClass.hashCode());
        System.out.println("===========");
        loader1 = null;
        aClass = null;
        System.gc();
        Thread.sleep(20000);
        loader1 = new MyTest17("loader1");
        loader1.setPath("C:/Users/lifeline张/Desktop/");
        aClass = loader1.loadClass("com.jvm.classloader.User");
        System.out.println("aClass" + aClass.hashCode());
    }
}
