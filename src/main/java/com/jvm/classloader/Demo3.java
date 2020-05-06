package com.jvm.classloader;

import java.util.UUID;

/**
 * 在初始化一个类时，并不会先初始化它所实现的接口；
 * 在初始化一个接口时，并不会先初始化它的父接口；
 *
 * @author sunhao
 */
public class Demo3 {

    public static void main(String[] args) {
        //在初始化一个类时，并不会先初始化它所实现的接口；
//        System.out.println(child3.a);
        //输出： 1
        //没有输出“Parent3 invoked”，说明父接口Parent3并没有被初始化。
//        System.out.println(Parent3.str2);
//        //在初始化一个接口时，并不会先初始化它的父接口；
        System.out.println(Parent3.t1);
        //输出：
        //Parent3 invoked
        //a58ee35a-6590-416d-bf6b-ba6976f0d268
    }

}

interface GrandPa {
    //下面这段代码相当于普通类中的“静态代码块”，打印出来就相当于该接口被初始化了；
    public static Thread t = new Thread() {
        {
            System.out.println("GrandPa invoked");
        }
    };
}

interface Parent3 extends GrandPa {
    String str2 = "Parent3";
    //运行期常量
    String str = UUID.randomUUID().toString();
    // 下面这段代码相当于普通类中的“静态代码块”，打印出来就相当于该接口被初始化了；
    public static Thread t1 =
            new Thread() {
                {
                    System.out.println("Parent3 invoked");
                    System.out.println(t);
                }
            };
}

class child3 implements Parent3 {
    public static String a = str;
}