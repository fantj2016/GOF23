package com.fantj.singleton;

/**
 * 枚举类（线程安全）
 * 它不仅能避免多线程同步问题，而且还自动支持序列化机制，防止反序列化重新创建新的对象，绝对防止多次实例化。
 */
public enum Singleton6 {
    INSTANCE;
    public void myMethod() {
        System.out.println("enum instance test");
    }
}