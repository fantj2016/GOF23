package com.fantj.proxy.cglib;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Me instance = (Me)new HuangNiu().getInstance(new Me("Fantj", "JAY演唱会门票"));
//        Me instance = (Me)new HuangNiu().getInstance(new Me());
        instance.speak();
        System.out.println("生成代理对象后对象变成:"+instance.getClass());

        /**
         * 生成代码
         */
        try {
            byte[] $Proxy0s = ProxyGenerator.generateProxyClass("Me$$EnhancerByCGLIB$$5d2d06a1", new Class[]{instance.getClass()});
            String path = com.fantj.proxy.jdk.Main.class.getResource("").toString();
//            System.out.println("get the path"+path);
            FileOutputStream fileOutputStream = new FileOutputStream("Me$$EnhancerByCGLIB$$5d2d06a1.class");
            fileOutputStream.write($Proxy0s);
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
