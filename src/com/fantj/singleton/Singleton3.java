package com.fantj.singleton;

/**
 * 饿汉式（线程安全）  因为它作为静态资源，所以在类装载时就被实例化
 */
public class Singleton3 {
    private static Singleton3 instance = new Singleton3();

    public static Singleton3 getInstance(){
        return instance;
    }
}