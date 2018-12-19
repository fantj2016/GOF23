package com.fantj.singleton;

/**
 * 懒汉式（线程不安全）  就是用的时候再进行实例化对象。
 */
public class Singleton {
    private static Singleton instance;  
    private Singleton (){}  
  
    public static Singleton getInstance() {  
    if (instance == null) {  
        instance = new Singleton();  
    }  
    return instance;  
    }  
}