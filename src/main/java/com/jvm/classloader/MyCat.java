package com.jvm.classloader;

public class MyCat {
    public MyCat() {
        System.out.println("MyCat is loader by:" + this.getClass().getClassLoader());
//        System.out.println(MySample.class);
    }
}






