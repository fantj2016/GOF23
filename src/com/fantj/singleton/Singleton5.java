package com.fantj.singleton;

/**
 * 登记式/静态内部类（线程安全）
 * 这种方式可以说是恶汉式的变通版，SingletonHandler没有被主动使用的情况下是不会实例化Singleton对象的，所以这样做，既能达到lazy式的加载，又能保证线程安全。
 */
public class Singleton5 {
    private static Singleton5 instance;

    private static class SingletonHandler{
        private static final Singleton5 INSTANCE = new Singleton5();
    }

    public static Singleton5 getInstance(){
        return SingletonHandler.INSTANCE;
    }
}