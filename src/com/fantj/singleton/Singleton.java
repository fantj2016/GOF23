package com.fantj.singleton;

/**
 * 懒汉式（线程不安全）  就是用的时候再进行实例化对象。
 */
public class Singleton {
    private static Singleton instance;

    /**
     * 必须添加私有的 构造方法，防止外面实例化该对象。
     */
    private Singleton (){}  
  
    public static Singleton getInstance() {  
    if (instance == null) {  
        instance = new Singleton();  
    }  
    return instance;  
    }  
}