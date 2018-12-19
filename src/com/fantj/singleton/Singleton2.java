package com.fantj.singleton;

/**
 * 懒汉式（线程安全）  可以在多线程环境下使用，但是效率太低。
 */
public class Singleton2 {
    private static Singleton2 instance;

    public static synchronized Singleton2 getInstance(){
        if (instance == null){
            instance = new Singleton2();
        }
        return instance;
    }
}